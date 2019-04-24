package com.jlc.ref;

import java.lang.reflect.*;

public class Lab724 {

    public static void main(String[] args) throws Exception {

        String cname = "com.jlc.ref.Hai";
        Class cl = Class.forName(cname);

        System.out.println("\n PUBLIC INNER CLASSES");

        Class[] pnlCls = cl.getClasses();
        for (int i = 0; i < plnCls.length; i++) {

            Class c = plnCls[i];
            System.out.println(c);

        }

        System.out.println("\n** DECLARED INNER CLASSES**");
        Class[] alnCls = cl.getDeclaredClasses();
        for(int i=0;i<alnCls.length;i++){

        Class c = alnCls[i];
        System.out.println(c);


        }  



        }

    }

}