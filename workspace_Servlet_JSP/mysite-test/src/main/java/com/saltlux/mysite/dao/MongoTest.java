package com.saltlux.mysite.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.bson.Document;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.saltlux.mysite.vo.UserVo;

public class MongoTest {
	private final int MONGO_PORT = 27017;
	private final String MONGO_HOST = "localhost";
	private final String DB_NAME = "webdb";

	private MongoClient mongo;
	private static MongoOperations mongoOps;

	//생성시DB와 연동
	public MongoTest() {
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

	//DB 컬렉션 모두 출력
	public Set<String> showCollections(){
		return mongoOps.getCollectionNames();
	}


	public UserVo findByEmailAndPassword( UserVo userVo) {
		
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("email").is(userVo.getEmail()),
				Criteria.where("password").is(userVo.getPassword())
				));
		ArrayList<UserVo> list = (ArrayList<UserVo>)mongoOps.find(query, UserVo.class, "user");
		return list.get(0);
	}
	
	
	public boolean insert(UserVo vo) {
		vo.setNo( (Integer.parseInt(MaxNo())+1)+"" );
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
	//해당 콜렉션에 있는 find all
	public List<UserVo> findAll(){		
		 return mongoOps.findAll(UserVo.class, "user");
	}

	public static String MaxNo() {
		Query query = new Query();			
		query.with(new Sort(Sort.Direction.DESC,"no"));
		query.limit(1);
		ArrayList<UserVo> user = (ArrayList<UserVo>) mongoOps.find(query,UserVo.class, "user");
		
		if(user==null) return "0";
		else return user.get(0).getNo();
	}
	
	public boolean delete(String no, String password) {
		Query query = new Query(new Criteria().andOperator(
				Criteria.where("no").is(no),
				Criteria.where("password").is(password)
				));
		mongoOps.remove(query, "user");		
		return true;
	}
	
	
	public static void main(String[] args) {

		MongoTest mt = new MongoTest();
		Gson gson = new Gson();
		
		Set<String> collections = mt.showCollections();
		for(String s : collections) {
			System.out.println("collection :: " + s);
		}
		
		//select
		System.out.println("user selectAll");
		ArrayList<UserVo> userList = (ArrayList<UserVo>) mt.findAll();		
		for(UserVo uv : userList) {
			System.out.println(uv);
		}
		//String result = gson.toJson(userList);
		//System.out.println("result :: " + result);
		
		UserVo userVo = new UserVo();
		userVo.setEmail("guest");
		userVo.setPassword("44");
		
		UserVo user = mt.findByEmailAndPassword(userVo);
		//String result2 = gson.toJson(user);
		//System.out.println("select no- result ::: " + result2);
		System.out.println("이메일:guest-비번:44 찾기\n"+user);
		
		UserVo nofind = mt.findByNo("2");
		System.out.println("no가 2일때- result ::: " + nofind);
		
		//insert--확인함
		
		UserVo userVo2 = new UserVo();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String time1 = format1.format(time.getTime());		
		
		userVo2.setName("테스트5");
		userVo2.setEmail("test5");
		userVo2.setPassword("555");
		userVo2.setGender("female");
		userVo2.setJoin_date(time1);
		//mt.insert(userVo2);
		
		
		//update
		UserVo userVo3 = new UserVo();
		
		userVo3.setName("쏘옹수정33");
		userVo3.setPassword("3333");
		userVo3.setGender("male");
		//mt.update(userVo3);
		
		//delete
		//mt.delete("6", "222");
		
		mt.close();
	}
}
