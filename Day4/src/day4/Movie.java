
package day4;

import java.util.Arrays;


public class Movie
{

    @Override
    public String toString() {
        return "Movie{" + "movieId=" + movieId + ", movieTitle=" + movieTitle + '}';
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
  
    

   



}


