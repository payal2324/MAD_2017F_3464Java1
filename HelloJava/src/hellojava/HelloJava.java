/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;


public class HelloJava {

    
    public static void main(String[] args)   // accessed using class name : static hellojava.main will be called by compiler
    {
       
        System.out.println("Welcome to JAVA Programming");   
        HelloJava obj = new HelloJava();
        obj.greet(new String[]{"Payal","priya","Baani"});
       obj.greet();
      //  HelloJava.main(new String[]{"hello"});     recursion will occur
        
    }
    
//    void greet(String name)
//    
//
//    {
//        System.out.println("Welcome , " + name);
//    }
    
    
    void greet(String[] names)
    

    {
        System.out.println("Welcome , " + names.length);
        
        for(int i =0; i< names.length ; i++)
        {
            System.out.println("Welcome , " + names[i]);
        }
        
        
    }
    
    
    
    
    
    
    
       void greet()       // static void greeet()  and static public void greet() is also valid 
    

    {
        System.out.println("Welcome , Lambton");
    }
    
    
    
}



// Q1 explain the structure of java program?
/*import package declaration
import section   -- 1) import from java 2) 3rd party libraries 3) import from your own project .

clas declaration
variables
method declaration
main method
{extra -- lin tools for auto formating  or clang can be used  
ctrl + space shortcut to get inbuilt codee  
shift + f6 to run 
name convention for class and method name 
javac file.java  compiler -- jvm -- interpreter 
java file   jre 

*/