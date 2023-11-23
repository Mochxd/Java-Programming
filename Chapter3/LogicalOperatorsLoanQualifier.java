package Chapter3;
import java.util.Scanner;
public class LogicalOperatorsLoanQualifier {
    public static void main(String[] args) {
        // initialize values
        int loanSalary = 3000;
        int reuiredYearsEmloyeed = 2;

        // Ask the employee for his salary
        System.out.println("Enter Your Salary: ");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        // Ask the employee for his working year
        System.out.println("what is the number of years since you have been working there? ");
        int years = input.nextInt();
        input.close();

        // check the results from the user using and operator
        if(salary >= loanSalary && years >= reuiredYearsEmloyeed){
                System.out.println("Congrats! You 're qualified for a loan");
            }
            else{
            System.out.println("Sorry! You 're not qualified for a loan. You need to earn at least 30000$");
        }
        }
}
