package com.saltlux.mysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;
import com.saltlux.mysite.vo.BoardVo;
import com.saltlux.mysite.vo.Guestbook02Vo;
import com.saltlux.mysite.vo.UserVo;

public class BoardDao {
	
	private final int MONGO_PORT = 27017;
	private final String MONGO_HOST = "localhost";
	private final String DB_NAME = "webdb";

	private MongoClient mongo;
	private static MongoOperations mongoOps;

	//생성시DB와 연동
	public BoardDao() {
		mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
		mongoOps = new  MongoTemplate(mongo, DB_NAME);		
	}
	
	
	public List<BoardVo> findAll(String p){
		Query query = new Query();		
		
		query.with(new Sort(Sort.Direction.DESC,"g_no"));
		query.with(new Sort(Sort.Direction.ASC,"o_no"));
		query.with(new Sort(Sort.Direction.ASC,"no"));
		query.with(new Sort(Sort.Direction.ASC,"depth"));
		query.skip(5*(Integer.parseInt(p)-1));
		query.limit(5);
		
		return mongoOps.find(query,BoardVo.class, "board");		
	}
	
	public List<BoardVo> findSearchAll(String p,String search) {
		Query query = new Query();			
		
		query.addCriteria(new Criteria().orOperator(
				Criteria.where("title").regex(java.util.regex.Pattern.compile(search)),
				Criteria.where("contents").regex(java.util.regex.Pattern.compile(search))));
		query.with(new Sort(Sort.Direction.DESC,"g_no"));
		query.with(new Sort(Sort.Direction.ASC,"o_no"));
		query.with(new Sort(Sort.Direction.ASC,"no"));
		query.with(new Sort(Sort.Direction.ASC,"depth"));
		query.skip(5*(Integer.parseInt(p)-1));
		query.limit(5);
		return mongoOps.find(query,BoardVo.class, "board");		
	}

	public BoardVo findByNo(String no) {
		int no2 = Integer.parseInt(no);
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("no").is(no2)));
		ArrayList<BoardVo> list = (ArrayList<BoardVo>)mongoOps.find(query, BoardVo.class, "board");
		return list.get(0);
	}
	
	//조회수 늘리기
	public boolean updateHit(String no) {
		int no2 = Integer.parseInt(no);
		Criteria criteria = new Criteria("no");
		criteria.is(no2);
		
		Query query = new Query(criteria);
		
		Update update = new Update();
		
		update.set("hit", Integer.parseInt(findByNo(no).getHit())+1);
		mongoOps.updateMulti(query, update, "board");
		
		return true;
	}
	
	public boolean update(String no, String title, String contents) {
		int no2 = Integer.parseInt(no);
		Criteria criteria = new Criteria("no");
		criteria.is(no2);
		
		Query query = new Query(criteria);
		
		Update update = new Update();
		
		update.set("title", title);
		update.set("contents", contents);
		mongoOps.updateMulti(query, update, "board");
		
		return true;
	}

	public static int MaxNo() {
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		query.limit(1);
		ArrayList<BoardVo> board = (ArrayList<BoardVo>) mongoOps.find(query,BoardVo.class, "board");
		
		if(board==null) return 0;
		else return board.get(0).getNo();
	}
	
	public static int MaxGno() {
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		query.limit(1);
		ArrayList<BoardVo> board = (ArrayList<BoardVo>) mongoOps.find(query,BoardVo.class, "board");
		
		if(board==null) return 0;
		else return board.get(0).getG_no();
	}
	
	public boolean insert(BoardVo vo) {
		String sql="";
		List<BoardVo> list = new BoardDao().findAll("1");
		System.out.println(list);
		
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String time1 = format1.format(time.getTime());
		vo.setRegDate(time1);
		
		vo.setNo( MaxNo()+1 );
		//첫글일 때
		if(list.isEmpty()) {
			vo.setHit("0");			
			vo.setG_no(1);
			vo.setO_no(1);
			vo.setDepth(0);
			vo.setFlag("0");
			mongoOps.insert(vo, "board");
			//sql ="insert into board values(null,?,?,?,?,0,?,now(),1,1,0,0)";
		//첫글이 아닐때	
		}else {
			vo.setHit("0");	
			vo.setG_no(MaxGno()+1);
			vo.setO_no(1);
			vo.setDepth(0);
			vo.setFlag("0");
			mongoOps.insert(vo, "board");
			//sql = "insert into board values(null,?,?,?,?,0,?,now(),(select max(cast(g_no as unsigned))+1 from board as b),1,0,0)";
		}
		return true;
	}
	
	
	public boolean delete(BoardVo originVo) {
		
		System.out.println("[삭제 원본글] "+originVo);
		//답글확인
		Query query = new Query(new Criteria().andOperator(
			Criteria.where("g_no").is(originVo.getG_no()),
			Criteria.where("no").gt(originVo.getNo())
			));
		ArrayList<BoardVo> list = (ArrayList<BoardVo>)mongoOps.find(query, BoardVo.class, "board");
		
		//답글이있을때
		if(!list.isEmpty()) {
			/*
			Criteria criteria = new Criteria("no");
			criteria.is(originVo.getNo());			
			Query query2 = new Query(criteria);
			*/
			Query query2 = new Query(new Criteria("no").is(originVo.getNo()));
			Update update = new Update();
			
			update.set("flag", "1");
			mongoOps.updateMulti(query2, update, "board");
		}else {//답글이없다! => 지운다!
			Query query3 = new Query(new Criteria("no").is(originVo.getNo()));
			mongoOps.remove(query3,"board");
		}
		return true;			
	}

	public boolean reply(BoardVo originVo, BoardVo vo) {
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String time1 = format1.format(time.getTime());		
		
		//insert
		vo.setNo( MaxNo()+1);
		vo.setHit("0");
		vo.setRegDate(time1);
		vo.setG_no(originVo.getG_no());
		vo.setO_no(originVo.getO_no()+1);
		vo.setDepth(originVo.getDepth()+1);
		vo.setFlag("0");
		mongoOps.insert(vo,"board");
		
		//update
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("g_no").is(originVo.getO_no()+1),
				Criteria.where("o_no").gte(originVo.getO_no())));
		Update update = new Update();
		
		update.inc("o_no", 1);
		mongoOps.updateMulti(query, update, "board");
		
		
		String sql2 = "insert into board values(null,?,?,?,?,0,?,now(),?,?,?,0)";
		String sql1 = "update board set o_no=o_no+1 where g_no=? and o_no>=?";
		
		return true;
	}

	public int getTotalB() {
		
		int result=0;
		Query query = new Query();	
		result =(int) mongoOps.count(query,BoardVo.class, "board");		
		return result;		
	}

	public int getTotalSearchB(String search) {
		int result=0;
		Query query = new Query();			
		
		query.addCriteria(new Criteria().orOperator(
				Criteria.where("title").regex(java.util.regex.Pattern.compile(search)),
				Criteria.where("contents").regex(java.util.regex.Pattern.compile(search))));
	
		result =(int) mongoOps.count(query,BoardVo.class, "board");		
		return result;
	}

	
}
