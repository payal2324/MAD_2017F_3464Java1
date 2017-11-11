
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistoperations;

import java.util.Comparator;


public class MovieSort {

    static void movieTitleComparator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 float ratings;
    public MovieSort( int movieId, String movieTitle,float ratings) {
        this.ratings = ratings;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
    }
 

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
   

    public MovieSort() {
    }

   
    int movieId;
    String movieTitle;
 
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
   
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

     /*Comparator for sorting the list by Student Name*/
    public static Comparator<MovieSort> movieTitleComparator = new Comparator<MovieSort>() {

	public int compare(MovieSort s1, MovieSort s2) {
	   String movieTitle1 = s1.getMovieTitle().toUpperCase();
	   String movieTitle2 = s2.getMovieTitle().toUpperCase();

	   //ascending order
	   return movieTitle1.compareTo(movieTitle2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};

    
}
