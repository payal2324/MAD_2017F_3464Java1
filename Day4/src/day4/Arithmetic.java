/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

 class ArithmeticEx
{
  
    
         
          static int addition ( int a , int b)
         {
             return a + b;
         }
         static int subtraction ( int a , int b)
         {
             return a - b;
         }
          
          
          
          
         
     }
     




public class Arithmetic
{
   public static void main(String[] args) 
    {
       if (args.length != 3)
       {
             System.out.println("Insufficient Arguments on command line ");

             System.out.println("Enter Operand1 Operator Operator2");
              System.out.println("Example : 10 + 20 or 20 - 10");
       }
       else

       {
            // convert string to  int
           int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
           
           char opt = args[1].charAt(0);
           
       
           switch (opt)
           {
              
               case  '+' :
                       System.out.println("Sum : " +  ArithmeticEx.addition(a, b));
                       break;
                  case '-' :
                       System.out.println("Sum : " +  ArithmeticEx.subtraction(a, b));
                       break;      
                  default :
                   System.out.println(" Enter Correct operand + , - " );
                   
           }
       }
       }
        
        
    }  




     
     
     
    
    
