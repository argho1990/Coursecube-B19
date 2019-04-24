package com.jlc.ref;

public class Lab726 {

    public static void main(String[] args) {

        try {

            String cname = "com.jlc.ref.User";
            Class cl = Class.forName(cname);
            Object obj = cl.newInstance();
            System.out.println(obj);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}

class User {

    User() {

        System.out.println("** User Def Cons **");

    }

}