/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class MovieComparatorExample {
    
   public static void main(String[] args) {
        // TODO code application logic here
        int x= 10, b = 2;
        System.out.println(x+b + (x++ + ++x));
        // 10 + 2 + ( 10 + 12)
        int c = x+b + x++ +  --b + ++x + b++;  // 34
      //  10 + 2 + 10 + 1+ 10 + 1;
      
      
      // 5 * 5 / 
      int y = 4;
      x = 3 + 2 * --y + y++ + y++;
      System.out.println("hiii" + x);
        int []a = {10, 1, 50, 30, 40};
        
        System.out.println(Arrays.toString(a));
        
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        //System.out.println(new Movie());
        
        String []str = {"Hello","a", "hello","b", "aa"};
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        MovieSort ms1 = new MovieSort(1,"Thor",1.2f);
        MovieSort ms2 = new MovieSort(15,"Baby Boss",1.3f);
        MovieSort ms3 = new MovieSort(30,"Fight Club",4.2f);
        MovieSort ms4 = new MovieSort(14,"Tinker Bell",5.2f);
        
        ArrayList<MovieSort> arrayListMovieSort = new ArrayList<>();
        arrayListMovieSort.add(ms1);
        arrayListMovieSort.add(ms2);
        arrayListMovieSort.add(ms3);
        arrayListMovieSort.add(ms4);
    Collections.sort(arrayListMovieSort, MovieSort.movieTitleComparator);
       
       System.out.println(" Collections Sorted Array List");
     //  MovieSort.movieTitleComparator();
       for(MovieSort m: arrayListMovieSort)
       {
           System.out.println(m.toString());
       }
        
        
         MovieSort.movieTitleComparator();
    
    
    
}
}
