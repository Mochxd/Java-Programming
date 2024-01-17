package Chapter7;

import java.util.Scanner;

public class TaskDays {
    public static void main(String[] args) {
        String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week: ");
        int index = input.nextInt();
        System.out.println(days[index - 1]);
        input.close();
    }
}
