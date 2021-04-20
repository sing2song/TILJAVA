package Construct;

import java.lang.reflect.Constructor;

public class test01 {
	public static void main(String[] args) throws Exception{
//	    Class userClass = User.class;
//	     
//	    Constructor cs = userClass.getConstructor(new Class[]{String.class, String.class, String.class, Integer.class});
//	     
//	    User user = (User)cs.newInstance("joontID","joontPWD","joont",920000);
//	    System.out.println(user.toString());
		
		
		
		  Class userClass = User.class;
		     
		    Constructor cs = userClass.getDeclaredConstructor(new Class[]{String.class, String.class});
		     
		    cs.setAccessible(true); // 중요. access 가능하도록 변경
		     
		    User user = (User)cs.newInstance("joontID","joontPWD");
		    System.out.println(user.toString());


	}


}
