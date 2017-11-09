
package day3;


public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Demo obj = new Demo();
     int sum = obj.sumOfSeries(5);
       System.out.println("Sum of numbers upto  = " + sum);       
        
      String rev =  obj.reverseTheString("hello");
        System.out.println(rev);       
         
        String revSB = obj.reverseString("helloworld");
         System.out.println(revSB);
        obj.findMax(13.0, 15.0, 17.5);
        
        
        // chaining of methods...... 
//        static String reverseString(String str) {
//       return new StringBuilder(str).reverse().toString();
//   }
        
        
        // Arrays of String type..
      //  String [] str ;   // str name di mem locatiion bn jani having null.
       String str[] = new String[5];   // 5 references create ho jnia    s[i] = new Employee type -> s[1].eid

        String s[] = {"A","B"};
        String s1[] = new String[]{"A","B","C"};
      
        Employee e = new Employee();
        e.getid();
    }
    
}
