package com.jlc.ref;

import java.lang.reflect.*;

public class Lab727 {

    public static void main(String[] args) {

        try {

            String cname = "com.jlc.ref.User";
            Class cl = Class.forName(cname);
            Class paramsReq[] = new Class[] { int.class, String.class, int.class, long.class };
            Constructor c = cl.getDeclaredConstructor(paramsReq);
            System.out.println(c);
            Class paramReq1[] = new Class[] { String.class, int.class };
            Constructor c1 = cl.getDeclaredConstructor(paramReq1);
            System.out.println(c1);
        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (NoSuchClassException e) {

            System.out.println("\n Required Constructor not found");
        }

    }

}

class Emp {

    Emp(int eid, String nm, int age, long phone) {
    }

    Emp(int eid, String nm) {
    }

}