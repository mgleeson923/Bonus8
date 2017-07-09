import java.util.Collections;
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
            System.out.println("Please choose a category: Scifi, Horror, Animated, Action, or Drama");

            //userInput to send to second class
            System.out.print("What category are you interested in?: ");
            userInput = scnr.nextLine();
            System.out.println();

            while (!userInput.equalsIgnoreCase("scifi") && (!userInput.equalsIgnoreCase("horror")) && (!userInput.equalsIgnoreCase("animated")) && (!userInput.equalsIgnoreCase("action")) && (!userInput.equalsIgnoreCase("drama"))) {
                System.out.print("Invalid Input. Please select from the following: Scifi, Horror, Animated, Action, or Drama:  ");
                userInput = scnr.nextLine();
                System.out.println();
            }

            userInput = userInput.toLowerCase();
            System.out.println("Category: " + userInput.substring(0,1).toUpperCase().concat(userInput.substring(1)));


            Movies list = new Movies();


            for (Movies m : list.listOfMovies()) {
                if (userInput.equalsIgnoreCase(m.getCategory())) {
                    System.out.println(m);
                }

            }

            System.out.print("Would you like to look at another category of films? Y/N: ");
            repeat = scnr.nextLine();
            System.out.println();

            while (!repeat.equalsIgnoreCase("Y") && (!repeat.equalsIgnoreCase("N"))) {
                System.out.print("Invalid Input. Check another player's stats? Y/N: ");
                repeat = scnr.nextLine();
                System.out.println();
            }

        }while (repeat.equalsIgnoreCase("Y"));

        System.out.println("Goodbye");

    }

}
