/*

=> [Access Modifiers] can be used to specify the 
           [scope] 
             or 
   [visibility] of the [class] 
             or 
    [members] of the [class].

=> There are 3 [access] modifiers:

   1.private
   2.protected
   3.public 

*******************************************************************************************************************
=> There are 4 [scopes] available:

Scope or Visibility         Modifier
 1. Private Scope           private 
 2. Default Scope          No Modifier 
 3. Protected Scope         protected    
 4. Public Scope             public  

********************************************************************************************************************
1. [Private Scope] :

=>  When you are using [private modifier] with the [members] of the [class] then the [scope] of those [members] will be 
    [private] scope.
  
=>  [Private scope] is also called as [class scope] i.e [private members] must be accessed from the [same] class where 
    it is declared.

=>  Private [members] cannot be accessed from outside the class,not even from subclass i.e [private] numbers will not 
    be inheritated to [sub classes].

=>  [Private members] can be used only for [members] of the [class] not for [class] itself.

*******************************************************************************************************************
2. [Default Scope] :
  
=> When you are not using any [modifier] with the [members] of the [class] ,then the scope of those [members] will be 
   the [default] Scope.

=> [Default Scope] is also called as [packaged scope],i.e [default members] can be accessed from the same [class],
   sub class and non sub class which are available in same [package].

=> [Default members] cannot be accessed from outside the [package] i.e [default members] will not be inherited to 
   [subclass] available in outside the [package].
 
=> [Default scope] is available for both [classes] and their [members].

*********************************************************************************************************************** 

3. [Protected Scope]:
 
 => When you are using protected [modifier] with the [members] of the [class] then the scope of those members will be 
    protected scope.

 => Protected members can be accessed from the same class,sub class and non sub class  which are available in 
    [same] package.

 => Protected members can be accessed from the sub classes which are available in different package.

 => Protected members cannot be accessed from the non sub classes which are available in different package.

 => Protected members can be used only for [members] of the class not for class itself.

********************************************************************************************************************* 

4. [Public Scope]:

=> When you are using pubic modifier with the [members] of the [class] then the scope of those [members] 
   will be [public scope].
 
=> [Public Scope] can be accessed from anywhere.

=> Public Modifier can be used for both the [classes] and their [members].

*********************************************************************************************************************
*/

