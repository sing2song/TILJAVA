package p87;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
        String mclass[] = {"비트","자바","수업"};
        for(String s : mclass)
        {
        	System.out.println(s);//비트 자바 수업
        }
        
        
        String mclass2[] = {"비트","자바","수업"};
        for(int i =0;i<mclass2.length;i++)
        {
        	System.out.println(mclass2[i]);
        }
        
        
        ArrayList<Integer> mclass3 = new ArrayList<Integer>();
        mclass3.add(new Integer(2020));
        mclass3.add(new Integer(02));
        mclass3.add(new Integer(01));
        for(Integer i :mclass3)
        {
        	System.out.println(i);
        }
    }
}
