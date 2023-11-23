package Chapter3;
import java.util.Scanner;
public class TestResult {
    public static <string> void main(String[] args) {
        //initialize values
        char grade;

        // Get the test Score
        System.out.println("What's your Score test?");
        Scanner input = new Scanner(System.in);
        double scoreTest = input.nextDouble();
        input.close();

        // Determine the letter grade
        if(scoreTest < 60) {
            grade = 'F';
        } else if (scoreTest < 70) {
            grade = 'D';
        }
        else if(scoreTest < 80) {
            grade = 'C';
        }
        else if(scoreTest < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("You Grade is " + grade);
    }
}
