/*

=========================================================== 
There are two types of arguments:
1) Formal Parameters:
2) Actual Parameters:
===========================================================

*/

/* 
    =============================================================================================
    
    Formal Arguments: 
 
    Arguments specified with the method definition or declaration are called as Formal Arguments.
    Formal Arguments are also called as Parameters.  
    
    =============================================================================================
*/

/*
        =============================================================
        Actual Arguments: 
        =============================================================  
        Arguments specified with method called as Actual Arguments.  
        =============================================================
        Ex: class Hello{                             Hello h = new Hello(); 
                                                     h.show(10,20);       
                                                             |  |
            void show(int a,int b){                        Actual Arguments  
                       |      | 
                    Formal Arguments 

            }
        }

*/

class Hello {
    // Formal Arguments:
    int show(int x) {
        System.out.println("show()");
        return x + 1;
    }

}

class Lab293 {

    public static void main(String args[]) {
        Hello h = new Hello();
        System.out.println(h.show(10));// Actual Arguments:
    }
}
