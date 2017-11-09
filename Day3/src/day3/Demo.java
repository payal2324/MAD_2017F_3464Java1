

// SB selfContained,, but string we have to return the value and store in new string, SB is more powerful.


// == reference check krda .equals values check krda in string.
package day3;


public class Demo 
{
   int i = 0;
   int sum = 0;
  int sumOfSeries(int n)
       {
            for (i=1; i <= n; i++)
            {
               sum = sum + i;
               
            }
            return sum;
              //System.out.println("Sum of numbers upto " + n + " = " + sum);            
       } 
           
    String reverseTheString(String str)
    {
        String rev = new String();
        
        char set[] = str.toCharArray();
         char temp[] = new char[set.length];
        int j=0;
        for (i=set.length - 1; i>=0 ; i--)
            
        {
        
         temp[j++] = set[i];
            
        }   
        
        return new String(temp);
    }
    
    String reverseString(String str)  // using String Builder
    {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        
        return sb.toString();
    }
    
    
    void findMax(double a, double b, double c)
    {
        double temp = a;
        if (b > a && b> c)
        {
            temp = b;
        }
        else if(c> a && c> b)
        {
            temp = c;
        }
        else
        {
            temp = a;
        }
        System.out.println("Maximum : " +  temp);
    }
    
    void findMax(int a, int b, int c)
    {
        if(a>b)
        {
            if (a>c)
            {
                System.out.println(a +  " is maximum");
            }
            else 
            {
               System.out.println(c +  " is maximum"); 
            }
        }
        
    }
}
//        String concatStrings(String arr[])
//        { 
//            StringBuilder arr1 = new StringBuilder();
//                  //  arr1 = arr;
//            for (i=0; i<=arr.length; i++ )
//            {
//          // arr1 = arr[i] + arr[i+1];
//            
//            
//        }
//        
//        return arr1;
//    }
    
    
    

