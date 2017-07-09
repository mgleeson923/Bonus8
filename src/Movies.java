import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by michaelgleeson on 7/7/17.
 */
public class Movies {

    //variables
    private String category;
    private String movieTitle;

    //blank constructor
    public Movies() {

    }

    //overloaded constructor
    public Movies(String movieTitle, String category) {
        this.category = category;
        this.movieTitle = movieTitle;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    //method to generate Array List
    public ArrayList<Movies> listOfMovies() {

        //Actual Array List of Movies
        ArrayList<Movies> list = new ArrayList<>();
        list.add(new Movies("Legally Blonde", "comedy"));
        list.add(new Movies("Zoolander", "comedy"));
        list.add(new Movies("Eurotrip", "comedy"));
        list.add(new Movies("Austin Powers", "comedy"));
        list.add(new Movies("Christmas Vacation", "comedy"));
        list.add(new Movies("Pulp Fiction", "drama"));
        list.add(new Movies("Fight Club", "drama"));
        list.add(new Movies("The Godfather", "drama"));
        list.add(new Movies("Goodfellas", "drama"));
        list.add(new Movies("Donnie Brasco", "drama"));
        list.add(new Movies("The Emperor's New Groove", "animated"));
        list.add(new Movies("The Lion King", "animated"));
        list.add(new Movies("Toy Story", "animated"));
        list.add(new Movies("Mulan", "animated"));
        list.add(new Movies("Batman: The Killing Joke", "animated"));
        list.add(new Movies("Star Wars: A New Hope", "scifi"));
        list.add(new Movies("Avatar", "scifi"));
        list.add(new Movies("The Matrix", "scifi"));
        list.add(new Movies("The Terminator 2: Judgment Day", "scifi"));
        list.add(new Movies("Back to the Future", "scifi"));
        list.add(new Movies("The Exorcist", "horror"));
        list.add(new Movies("Friday the 13th", "horror"));
        list.add(new Movies("It", "horror"));
        list.add(new Movies("The Blair Witch Project", "horror"));
        list.add(new Movies("The Shining", "horror"));
        list.add(new Movies("Iron Man", "action"));
        list.add(new Movies("Raiders of the Lost ark", "action"));
        list.add(new Movies("Die Hard", "action"));
        list.add(new Movies("Rambo", "action"));
        list.add(new Movies("The Boondock Saints", "action"));

        return list;
    }

        @Override
        public String toString () {

            return movieTitle;
        }
    }
