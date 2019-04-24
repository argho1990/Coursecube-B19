
/*
-----------------------------------------------------------------------------------------------------------------


1. [Inheritance] is the [process] of writing [new class] by [inheriting] commonly used [state] and [behaviour] of 
   [existing class].

2. [Existing Class] --> [Super Class] --> [Base class] --> [Parent Class].

3. [Newly defined Class] --> [Sub Class] --> [Derived Class] --> [Child Class].

4. [Inheritance] is an important [property] or [features] of [OPPS].

5. Main [goal] of [Inheritance] is [code-reusability]. 
   i.e [Inheritance] can be used to [re-use] the [properties] and [operations] of the 
   [existing class] in the newly [defined class].

6. Types of Inheritance:

  A. Simple Inheritance.
  B. Multilevel Inheritance.
  C. Hierarchical Inheritance.
  D. Multiple Inheritance.
  E. Hybrid Inheritance.
  
 ---------------------------------------------------------------------------------------------------------------  

  [In Simple Inheritance]:
  There will be only 1 [super class] and [1 sub class].

  class A{}
  Class B extends A{..}

  [A]  [super class]
   |
  [B]  [sub class] 

---------------------------------------------------------------------------------------------------
 [Multilevel Inheritance]:
  
  1 [super-class] can have only [direct-sub-class] and many [indirect-sub-classes].
  1 [sub class] can have only 1 [direct super class] and many [indirect-super-classes].

  [A] [super-class]             [A] [indirect-super-class]
   |                             |    
  [B] [direct-sub-class]        [B] [direct-super-class]
   |                             | 
  [C] [indirect-sub-class]      [C]  [subclass]
   
   class A{..}
   class B extends A{..}
   class C extends B{..}
 
 ---------------------------------------------------------------------------------------------------  
   
 [Heirarchial Inheritance]:
 
 In Hierarchial Inheritance,
 One super class can have many direct subclasses.
 One sub class can have only one direct super class.
 
         [A]         [super class]        [direct subclasses]
       /     \
    [B]       [C]  [direct sub classes]     [sub classes]
    
 Ex:

 class A{...}
 class B extends A{...}
 class C extends A{...} 

 -----------------------------------------------------------------------------------------------------
 [In Multiple Inheritance]:

 In Multiple Inheritance,
 One subclass can have many direct super classes.
 One super class can have only one direct sub class.

    [A]    [B]   [direct super classes]         [super class]            Ex:
      \   /                                                              class A{...}
       [C]           [sub class]             [one direct sub class]      class B{...}
                                                                         class C extends A,B{}    
 
 Java doesn't support [Multiple Inheritance].
 Java supports [Multiple Inheritance] with [Interfaces].

-------------------------------------------------------------------------------------------------------
[Hybrid Inheritance]:

[Hybrid Inheritance] is the combination of two or more inheritance type.

[A]   [B]                   
   \ /  
    C                   
   / \
[D]   [E]           

-------------------------------------------------------------------------------------------------------

Combination of [Multiple Inheritance],[Heirarchial Inheritance] and [Multilevel Inheritance].

      [A]
     /   \
   [B]   [C]
    |     | 
   [D]   [E] 

Combination of [Hierarchial Inheritance] and [Multilevel Inheritance].

--------------------------------------------------------------------------------------------------------

*/

class Lab324 {

  public static void main(String args[]) {

    Hai hai = new Hai();
    System.out.println(hai.a);
    // System.out.println(hai.b);//super class cannot access sub class members.
    Hello hello = new Hello();
    System.out.println(hello.a);// [sub class] can access all the [super class members].
    System.out.println(hello.b);// [sub class] can access its own [members].

  }
}

class Hai {

  int a = 99;

}

class Hello extends Hai {

  int b = 88;

}