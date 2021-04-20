package com.saltlux.mysite.dao;

import java.sql.Connection;
import java.sql.Date;
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

import com.mongodb.MongoClient;
import com.saltlux.mysite.vo.Guestbook02Vo;
import com.saltlux.mysite.vo.UserVo;

public class Guestbook02Dao {
	private final int MONGO_PORT = 27017;
	private final String MONGO_HOST = "localhost";
	private final String DB_NAME = "webdb";

	private MongoClient mongo;
	private static MongoOperations mongoOps;

	//생성시DB와 연동
	public Guestbook02Dao() {
		mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
		mongoOps = new  MongoTemplate(mongo, DB_NAME);		
	}
	
	
	public List<Guestbook02Vo> findAll(){
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		return mongoOps.find(query,Guestbook02Vo.class, "guestbook");
	}
	
	public boolean insert(Guestbook02Vo vo) {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String time1 = format1.format(time.getTime());		
		
		vo.setNo( (Integer.parseInt(MaxNo())+1)+"" );
		vo.setReg_date(time1);
		System.out.println("guestbookdao에서 add할 vo"+vo);
		mongoOps.insert(vo, "guestbook");
		
		return true;
	}

	public static String MaxNo() {
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		query.limit(1);
		ArrayList<Guestbook02Vo> book = (ArrayList<Guestbook02Vo>) mongoOps.find(query,Guestbook02Vo.class, "guestbook");
		
		if(book.isEmpty()) return "0";
		else return book.get(0).getNo();
	}
	
	public boolean delete(String no, String password) {
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("no").is(no),
				Criteria.where("password").is(password)
				));
		mongoOps.remove(query, "guestbook");		
		return true;
	}
	
}
