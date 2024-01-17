package Chapter6;

import java.util.Scanner;

public class RoomCalc {
    private Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        RoomCalc calculator = new RoomCalc();
        Rectangle kitchen = calculator.GetRoom();
        Rectangle bathroom = calculator.GetRoom();
        double area = calculator.CalculateArea(kitchen, bathroom);
        System.out.println("Total area of the rooms: " + area);
        calculator.input.close();
    }
    public double CalculateArea(Rectangle kitchen, Rectangle bathroom) {
        return kitchen.GetArea() + bathroom.GetArea();
    }
    public Rectangle GetRoom() {
        System.out.println("Enter the width of your room: ");
        double width = input.nextDouble();
        System.out.println("Enter the height of your room: ");
        double height = input.nextDouble();
        return new Rectangle(width, height);
    }
}
