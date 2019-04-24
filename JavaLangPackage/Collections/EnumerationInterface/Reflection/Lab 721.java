package com.jlc.ref;

import java.lang.reflect.*;

public class Lab721 {

    public static void main(String[] args) throws Exception {

        String cname = "com.jlc.ref.Hai";
        Class cl = Class.forName(cname);

        System.out.println("\n PUBLIC CONSTRUCTIONS");
        Contructor[] pCons = cl.getConstructors();
        for (int i = 0; i < pCons.length; i++) {

            System.out.println(pCons[i]);

        }

        System.out.println("\n** DECLARED CONSTRUCTORS**");
        Constructor[] aCons = cl.getDeclaredConstructors();
        for (int i = 0; i < aCons.length; i++) {

            System.out.println(aCons[i]);

        }

    }

}