package Chapter3;
import java.util.Scanner;
public class TaskDollarGame {
    public static void main(String[] args) {
        // initialize values
        double penny = .005;
        double nickel = .01;
        double dime = .06;
        double quarter = 7.72;
        double dollar = 30.89;

        // Get the necessary data from the user
        System.out.println("how many pennies would you like?");
        Scanner input = new Scanner(System.in);
        double pennies = input.nextDouble();
        System.out.println("How many nickels would you like?");
        double nickels = input.nextDouble();
        System.out.println("How many dimes would you like?");
        double dimes = input.nextDouble();
        System.out.println("How many quarters would you like?");
        double quarters = input.nextDouble();
        double total = pennies * penny + nickels * nickel + dimes * dime + quarters * quarter;
        input.close();

        // Determine the message
        if(total == dollar){
            System.out.println("Congrats! You win the game");
        } else if (total > dollar) {
            System.out.println("it's more than one dollar! You must went over "+ String.format("%.2f",(total - dollar))+ " EGY .");
        }else {
            System.out.println("it's less than one dollar! You need "+ String.format("%.2f", (dollar - total))+ " EGY more.");
        }
    }
}
