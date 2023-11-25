package Chapter4;
import java.util.Scanner;
public class GrossPayInputValidation {
    public static void main(String[] args) {
        // initialize values
        int rate = 15;
        int maxHours = 40;

        // Ask the employee for his salary
        System.out.println("Enter Your weekly hours worked: ");
        Scanner input = new Scanner(System.in);
        double workedHours = input.nextDouble();

        // check the results from the user using and operator
        while (workedHours > maxHours || workedHours < 1 ) {
            System.out.println("Invalid Value!You must input hours between 1 and 40");
            workedHours = input.nextDouble();
        }
        // Calculate the gross salary
        double groos = rate * workedHours;
        System.out.println("Your salary is " + groos + "$");
    }
}
