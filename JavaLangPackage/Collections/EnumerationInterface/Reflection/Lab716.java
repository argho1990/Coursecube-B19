package com.jlc.p1;

public class Lab716 {

    public static void main(String[] args) {

        String className = "com.jlc.p1.Hello";
        try {

            Class cls = Class.forName(lassName);
            System.out.println("Class loaded successfully");
            System.out.println("Class Name:" + cls.getName());

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}

class Hello {
}