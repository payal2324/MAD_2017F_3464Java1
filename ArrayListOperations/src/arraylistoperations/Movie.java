
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistoperations;

/**
 *
 * @author moxdroid
 */
public class Movie implements Comparable<Movie>{

    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId + ", movieTitle=" + movieTitle + '}';
    }

    public Movie() {
    }

    public Movie(int movieId, String movieTitle) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
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

    @Override
    public int compareTo(Movie m) {
     //return this.movieId - m.movieId;  // ascending
     // ulta krange ta descending
     return this.movieTitle.compareTo(m.movieTitle);
    }
    
}
