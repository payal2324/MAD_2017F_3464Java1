/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

public class CLA 
{
    
    public static void main(String [] args)
    {
      
        System.out.println("CLA Executed");
        System.out.println("length : " + args.length) ;
       reverseStrings(args);
        
    }
     public static void reverseStrings(String[] arrStr1) {
        if(arrStr1.length > 0)
       {
         
           
       
       // for (String s:args)
     
            StringBuilder s2 = new StringBuilder();
            for (int i = 0; i < arrStr1.length; i++) {
            s2 = s2.append(arrStr1[i]);
            }
            System.out.println(s2);   // ms. 
             System.out.println(s2.reverse());   // .sm
            // s2.delete(i, i);
        }
       
        // System.out.println(reverseStrings(args));
        System.out.println(concatStrings(arrStr1));
     }
    
    
    
    // static void reverseStrings(String[] arrStr1) {
      // StringBuilder s1 = new StringBuilder();
      
      // for (int i = 0; i < arrStr.length; i++) {
           
        //    s1.append(arrStr[i]);
        //    s1.append(" ");
       // System.out.println(s1.reverse());
        //  System.out.println(s.reverse(arrStr[i].toString()));
     //  }
     //  s.reverse();
      // return s.toString();
  // }
    
    
    
    
    
    
       public static String concatStrings(String[] arrStr) {
       StringBuilder s = new StringBuilder();
       for (int i = 0; i < arrStr.length; i++) {
        
           s.append(arrStr[i]);
       }
       s.reverse();
       return s.toString();
   }
        
//        for (int i=0; i< args.length;i++)
//        {
//            System.out.println(args[i]);
//        }
    }
    
    
    

