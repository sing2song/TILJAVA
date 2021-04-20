package com.saltlux.reflection;

import java.lang.reflect.Field;

public class DemoReflection5 {
    public int num = 5;

    public static void main(String[] args) {
        try{
            Class c = Class.forName("com.saltlux.reflection.DemoReflection5");
            Field f = c.getField("num");
            DemoReflection5 demo = new DemoReflection5();
            System.out.println("num: " + demo.num);
            f.setInt(demo, 7);
            System.out.println("num: " + demo.num);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}