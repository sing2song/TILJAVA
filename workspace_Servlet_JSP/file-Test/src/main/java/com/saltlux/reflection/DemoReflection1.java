package com.saltlux.reflection;

class A{}

public class DemoReflection1 {
	public static void main(String[] args) {
        try{
            Class c = Class.forName("com.saltlux.reflection.A");

            boolean b = c.isInstance(new Integer(22));
            System.out.println(b);  //false

            boolean b1 = c.isInstance(new A());
            System.out.println(b1); //true
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
