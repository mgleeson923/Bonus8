import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/7/17.
 */
public class Bonus8 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userInput;
        String repeat;

        do {
            System.out.println("Welcome to the Grand Circus Movie Database");

            //list of categories
            System.out.println("SciFi, Animated, Horror, Drama");

            //userInput to send to second class
            System.out.println("What category are you interested in?: ");
            userInput = scnr.nextLine();

            Movies list = new Movies();
            //Movies


            for (Movies m : list.listOfMovies()) {
                if (userInput.equalsIgnoreCase(m.getCategory())) {
                    System.out.println(m);
                }

            }

            System.out.print("Would you like to look at another category of films? Y/N: ");
            repeat = scnr.nextLine();

        }while (repeat.equalsIgnoreCase("Y"));
    }

}
