package Chapter3;
import java.util.Scanner;
public class QuotaCalculator {
    public static void main(String[] args) {
        // initialize values
        int quota = 10;

        //Get the necessary values from the user
        System.out.println("Enter the number of sales this week: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        // Check the results from sales and quota
        if(sales >= quota)
            System.out.println("Congrats you've met your quota");
        else{
            int short_quota = quota - sales;
            System.out.println("We are sorry to inform you that you've not met your quota, your quota is " + sales + " and you need " + short_quota);
        }
    }
}
