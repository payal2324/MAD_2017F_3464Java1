                                        // type conversion 
package day4;


public class Demo4 {

    
    public static void main(String[] args) 
    {
        
                           /// example 1      casting ////
//        
//       int a = 10;
//       int b= a;
//       long c = 100;
//                           // a = c;  
                             // compile time error bigger to smaller krn lgge esli cast krna penda explicitlty
     
    //  a = (int)c ;       // explicit casting.. demoting the vaalue ...
       
        //  int d = a*b;   // working
        
                                // example  2 
        short a1 = 10;
        short b1 = 20;
        short c1 = a1;   // working 
        
      //  short d = a1 * b1;   // problem for short .. bcz compiler evaluates arithmetic operation result in integer.
        
      short   d = (short)(a1 * b1);  // working
        
      
      int a = 23, b = 5;
      
      
      int c = a / b;
        System.out.println(c);     // 4 
        float e = a/b;
        System.out.println("e  " + e);   // 4.0
        
        
         System.out.println("ceil  " + Math.ceil(a/b));     // 4.0
        System.out.println("ceil   1   " + Math.ceil((float)a/b));   // 5.0
           System.out.println("ceil   2   " + Math.ceil((float)(a/b)));   // 4.0
        
        e = (float)(a/b);
       System.out.println("e casted " + e);
        
        float f = 5.0f;    // only 5.0 will give error 
        float g = a/f;
        System.out.println(g);   
        
        //   in case of character ..
        char ch = 65;
        System.out.println(ch);  // A 
        int ch1 = 'A';
          System.out.println(ch1); // 65
        char ch2 = 'A';
        System.out.println(ch2);  // A
        char ch3 = '1';
        System.out.println(ch3); //  1 
        
        // strings...
        
        
        String s1 = "Hello";
        String s2 = "  Hello".trim();
        // s1 == s2 false dayega bcz string pool complie time te memory allocate krda alg memory allocate hoi  . 
        ///  te == refference chk krda. run time   te oh chk krega 
        
        
        // my coding .. 
        int x = 10;
        Integer y ;
        // System.out.println("y default" + y);
        y = Integer.parseInt(s1); // converting string to int..
        System.out.println("y" + y);
        String s = String.valueOf(x);     // int to string....
        
    //    p to w boxing
    //
    
          // sir di coding ... 
          
        Integer a11 = 100;
        int a13 = a11;
        int a12 = Integer.parseInt("12");
        String s11 = String.valueOf(12);  // string ch valueOf hunda .  type conversion 
        
        Integer a14 = new Integer(20);
        a14.intValue();   // w to p type.  unboxing 
        
        
        
      
        
        
        
    }
    
}
