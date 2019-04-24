/*
 * Case 3:Creating package in other Directory in Other Drives: D:/ E:/ | | JLC
 * app | | Core classes | | PACK com | | Hello.java jldindia | Hello.class
 ******************************************************************************************
 * 
 * Exploring the Classpath:
 ******************************************************************************************
 * 
 * 
 * Classpath represents the [path] where class files and packages or JAR files
 * available. By defualt you can access the classes from the same location where
 * it is available. For example,consider the above Case 3: java
 * com.jlc.india.Hello ->Gives me error
 * 
 * When you want to access classes from other location of file system then you
 * need to specify the location of class file by setting the Classpath. For
 * example: Consider the above CASE 3:
 * 
 * Option 1: Temporarily for Current Execution java -cp E:\app\classes\
 * com.jlcindia.Hello
 * 
 * Option 2: Temporarily for Current Command Prompt set CLASSPATH =
 * %CLASSPATH%;E:\app\classes;
 * 
 * Option 3: Permanently in System Environment Variables Steps: 1.Open my
 * Computer. 2.Right Click on Blank Area and select Properties. 3.From Left Side
 * Panel,Click on Advanced System Settings. 4.Click on Environment Variables
 * Button. 5.Click on New Button in the User Variable. 6.Provide the required
 * info Variable name CLASSPATH Variable value %CLASSPATH%;E:\app\classes
 * 7.Click on OK button in all the windows.
 ****************************************************************************
 * 
 * 
 */
