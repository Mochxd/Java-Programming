package Chapter2;
import java.util.Scanner;
public class task1 {
    public static <string> void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Get the season of the year
            System.out.println("What is the Season of the year?");
            String season = input.next();
            // Get the whole number
            System.out.println("What is the Whole number?");
            int number = input.nextInt();
            // Get the adjective
            System.out.println("Enter an adjective: ");
            String adjective = input.next();
            input.close();
            // Get all phases in one line
            System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number +
                    " cups of coffee.");
    }
}
