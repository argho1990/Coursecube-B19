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
    byte show(byte x) {
        System.out.println("show()");
        return x;
    }

}

class Lab295 {

    public static void main(String args[]) {
        Hello h = new Hello();
        byte b = 12;
        System.out.println(h.show(b));// Actual Arguments
        System.out.println(h.show((byte) 12));// Actual Arguments:// "byte = 1"s
    }
}