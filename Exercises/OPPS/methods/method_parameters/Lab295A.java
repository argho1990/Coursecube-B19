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
    char show(char x) {
        System.out.println("show(char)");
        return x;
    }

}

class Lab295A {

    public static void main(String args[]) {
        Hello h = new Hello();
        // System.out.println(h.show(65));
        // Actual Arguments don't match the formal argument requirements.
        System.out.println(h.show('A'));
        System.out.println(h.show((char) 65));// type casted[actual arguments] to match type of [formal arguments] in
                                              // the
                                              // method.
    }
}