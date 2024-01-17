package Chapter7;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers you will enter: ");
        grades = new int[input.nextInt()];
        getGrades();
        System.out.println("The Average of grades is " + String.format("%.2f",calculateAvg()));
        System.out.println("The highest number is " + getHighest());
        System.out.println("The lowest number is " + getLower());

    }
    public static void getGrades(){
        for(int i=0; i< grades.length; i++){
            System.out.println("Enter grade " + (i+1));
            grades[i] = input.nextInt();
        }
    }
    public static int calculateSum(){
        int sum=0;
        for( int grade : grades){
            sum += grade;
        }
        return sum;
    }
    public static double calculateAvg(){
        return calculateSum()/grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }
    public static int getLower(){
        int lower = grades[0];
        for(int grade : grades){
            if(grade < lower) {
                lower = grade;
            }
        }
        return lower;
    }
}
