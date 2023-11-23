package Chapter2;
import java.util.Scanner;
public class GrossPayCalculator {
    public static <string> void main(String[] args) {
        // Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        // Get the hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        Scanner input2 = new Scanner(System.in);
        double ratE = input2.nextDouble();
        // Multiply hours and pay rate
        double grossPay = hours * ratE;
        // Display Result
        System.out.println("The employee's gross pay is " + grossPay);
    }
}
