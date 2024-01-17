package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteyTicket {
    private static final int LENGTH=6;
    private static final int MAX_NUMBER=69;

    public static void main(String[] args) {
        int[] ticket = randomNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] randomNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++){
            int randomNumber;
            // check duplication
            do{
                randomNumber = random.nextInt(MAX_NUMBER) + 1;
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static boolean search(int[] array, int searchNumber){
        for(int value : array){
            if(value == searchNumber) {
                return true;
            }
        }
        return  false;
    }
    public static boolean binarySearch(int[] array, int searchNumber){
        Arrays.sort(array);
        int i = Arrays.binarySearch(array, searchNumber);
        if(i>=0) return true;
        else return false;
    }
    public static void printTicket(int ticket []){
        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}