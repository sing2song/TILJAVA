package com.saltlux.reflection;

import java.util.HashSet;
import java.util.Set;

public class DemoReflection {
    public static void main(String[] args) throws ClassNotFoundException{

        //임의의 클래스를 가져오는 방법
        Class c = "foo".getClass();
        System.out.println(c);      //class java.lang.String

        //Array는 객체이므로 Array 인스턴스에서 클래스 정보를 로드할 수 있습니다.
        byte[] b = new byte[1024];
        Class c1 = b.getClass();
        System.out.println(c1);     //class [B

        Set<String> s = new HashSet<>();
        Class c2 = s.getClass();
        System.out.println(c2);     //class java.util.HashSet

        //.class 문법
        //boolean bl;
        //Class c3 = bl.getClass();   //컴파일 에러 발생
        Class c4 = boolean.class;
        System.out.println(c4);     //boolean

        Class c5 = java.io.PrintStream.class;
        System.out.println(c5);     //class java.io.PrintStream

        Class c6 = int[][].class;
        System.out.println(c6);     //class [[I

        //아래와 같이 패키지 명으로 클래스를 로드할 수 있습니다.
        Class c7 = Class.forName("com.saltlux.reflection.ReflectionApplication");
        Class doubleArray = Class.forName("[D");    //class [D
        Class stringArray = Class.forName("[[Ljava.lang.String;");  //class [[Ljava.lang.String;


        Class c8 = Double.TYPE;     //double
        Class c9 = Void.TYPE;       //void
    }
}