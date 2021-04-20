package com.saltlux.reflection;
import java.lang.reflect.Constructor;

public class DemoReflection3 {
    public DemoReflection3(){

    }

    protected DemoReflection3(String s, int b){

    }

    public static void main(String[] args) {
        try{
            Class c = Class.forName("com.saltlux.reflection.DemoReflection3");

            Constructor[] cs = c.getDeclaredConstructors(); //선언된 생성자의 정보를 받아옴.

            for(int i=0; i<cs.length; i++){//2번반복함
                Constructor c1 = cs[i];
                System.out.println("name: " + c1.getName());
                System.out.println("declare Class: " + c1.getDeclaringClass());

                Class[] gpt = c1.getParameterTypes();//파라미터타입가져오기

                for(int j=0; j<gpt.length; j++){
                    System.out.println("Param: " + gpt[j]);
                }
            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}