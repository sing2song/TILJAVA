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
import com.saltlux.mysite.vo.UserVo;

public class UserDao {
	private final int MONGO_PORT = 27017;
	private final String MONGO_HOST = "localhost";
	private final String DB_NAME = "webdb";

	private MongoClient mongo;
	private static MongoOperations mongoOps;
	
	public UserDao() {
		mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
		mongoOps = new  MongoTemplate(mongo, DB_NAME);		
	}
	
//연결 끊기
	public void close() {
		try {
			mongo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public UserVo findByEmailAndPassword( UserVo userVo) {
		
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("email").is(userVo.getEmail()),
				Criteria.where("password").is(userVo.getPassword())
				));
		ArrayList<UserVo> list = (ArrayList<UserVo>)mongoOps.find(query, UserVo.class, "user");
		if(list.isEmpty())
			return null;
		else
			return list.get(0);
	}
	
	public boolean insert(UserVo vo) {
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String time1 = format1.format(time.getTime());
		
		vo.setNo( (Integer.parseInt(MaxNo())+1)+"" );
		vo.setJoin_date(time1);
		mongoOps.insert(vo, "user");
		
		return true;
	}


	public UserVo findByNo(String no) {
			
			Query query = new Query(new Criteria().andOperator(
					Criteria.where("no").is(no)));
			ArrayList<UserVo> list = (ArrayList<UserVo>)mongoOps.find(query, UserVo.class, "user");
			return list.get(0);
		}
	
	public boolean update(UserVo vo) {
		
		Criteria criteria = new Criteria("no");
		criteria.is(vo.getNo());
		
		Query query = new Query(criteria);
		
		Update update = new Update();
		
		update.set("name", vo.getName());
		update.set("password", vo.getPassword());
		update.set("gender", vo.getGender());
		mongoOps.updateMulti(query, update, "user");
		
		return true;
	}

	public static String MaxNo() {
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		query.limit(1);
		ArrayList<UserVo> user = (ArrayList<UserVo>) mongoOps.find(query,UserVo.class, "user");
		if(user==null) return "0";
		else return user.get(0).getNo();
	}
}
