package Chapter3;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        // initialize values
        int salary = 1000;
        int bonus = 250;
        int realSales = 10;

        //Determine Sales of the employee in the week
        System.out.println("What's the sales that employee does this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        //Determine the employee gets the bonus or not
        if(sales > realSales) {
            salary = salary + bonus;
        }
        System.out.println("The employee's salary is " + salary + " $");
    }
}
