/* 
 *  A [package] is a [namespace] that [organizes] a [set of related]
 *  => [classes],
 *  => [interfaces],
 *  => [enums] and
 *  => [annotations].
 *  -------------------------------------------------------------------------------------------------------------------
 *  
 *  => [Package] indicates the [directory] or [folder] in your [file systems] where you can place your [project files]. 
 * 
 *  => [Package] can be defined as [namespace] to identify the [classes] uniquely.
 * 
 *  => [Package] can be used to specify the access [scope] of your [class] or [class members]. 
 * 
 *---------------------------------------------------------------------------------------------------------------------
 *
 *  Package  Distrubution:
 *  [Syntax] :
 *  Ex :
 *  package p1;
 *  package p2;
 *  etc   
 * 
 * ----------------------------------------------------------------------------------------------------------------- 
 */

/*

 class Lab348{

    public static void main(String args[]){

    System.out.println("Hello Guys");

    }
}

/*

Steps to compile withoiut package:
Syntax:
javac <sourceFileName>.java

Ex: 
  javac Lab348
  
*/

package p1;

class Lab348 {

  public static void main(String args[]) {

    System.out.println("Hello Guys");

  }

}

/*
 * 
 * In the above examples
 * 
 * => [Lab348] is written without any [package declaration statement]. =>
 * [Lab349] is written with a [package declaration statement] statement called
 * [package p1].
 * 
 * => When you are [writing classes] without any [package declaration statement]
 * then those [classes] will be placed in the [default package].
 * 
 * => [Defualt package] is the [package] without any name i.e when you [compile
 * source files] with [defualt package] then compliled [class files] will be
 * placed in [current folder] only.
 * 
 * => When you are writing classes with a package declaration statement then
 * those classes will be placed in the specified package i.e when you compile
 * source files with package declaration statement then compiled class files
 * will be placed in specified package. => When a class is specified inside a
 * package then that class must be referred always with the package name which
 * is also called as fully qualified class name.
 * 
 * => Organizing Packages: Package name is a combination of multiple words
 * seperated with dot (.) command. Each word in the package name,represents one
 * folder or directory in the file system. Ex:
 * 
 * package com.jlcindia.sms.struts; package com.jldindia.sms.hibernate; package
 * com.jlcindia.sms.ejb;
 * 
 * [com] | [jldindia] | [sms] / | \
 * 
 * [struts] [hibernate] [ejb]
 * 
 * =>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
