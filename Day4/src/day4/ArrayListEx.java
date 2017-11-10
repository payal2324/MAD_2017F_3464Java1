/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
  

    public static void main(String[] args)
    {
        int []a = { 10,1,5,30,40};
        System.out.println("a" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(" sorted a" + Arrays.toString(a));
        
        
        String []b = { "a","hello","Hello","b"};
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
         System.out.println(Arrays.toString(b));
        
        Movie m1 = new Movie(1,"Thor");
Movie m2 = new Movie(2,"Baby Boss");
Movie m3 = new Movie(3,"Tinker Bell");

ArrayList<Movie> al = new ArrayList<>();
al.add(m1);
al.add(m2);
al.add(m3);
System.out.println(al.size());
   System.out.println(al.get(2));  
   
    System.out.println(al.size());
   for(Movie m : al)
       
   {
      
      System.out.println(m.toString());
   }
 
   //al.add(new Movie(2,"Magnificient"));
   al.add(1,new Movie(5,"Magnificient") );
   System.out.println(al.size());
   for(Movie m : al)
       
   {
       
      System.out.println(m.toString());
   }
   
   al.stream()
        .filter(s->s.toString().contains("Thor"))
        .forEach(System.out::println);
   
   
   
   System.out.println("new code for for loop");
   al.forEach((m) -> 
   {
      System.out.println(m.toString());
    });

        
   
    }
}

