/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;



//String [] str ;   // str name di mem locatiion bn jani having null.
//str = new String[5]; 


public class Employee
{
    int a,b;
   int empid;  // sare accesss kr skde
    
    
    // this block is executed if we create an object in other class
   // ech variables nu initialize kr skde ya 
    {
    a = 5;
      System.out.println("I am outside the main block   1" + a);  
    }
    
    
     {
         b = 1000;
      System.out.println("I am outside the main block   2" + a);  
    }
    
    
     
     void getid()
     {
        // this.empid =1;
       System.out.println("e.getidcalled() " + empid); 
        System.out.println("I am outside the main block   3" + b);  
     }
//    public  static void main(String[] args)
//    {
//        // if we run employee class main gets executed...
//        
//      System.out.println("I am inside the main()");  
//        
//        
//    }
}
