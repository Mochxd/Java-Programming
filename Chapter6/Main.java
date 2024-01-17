package Chapter6;

public class Main {
    public static void main(String[] args) {
        Rectangle x = new Rectangle();
        x.SetWidth(5);
        x.SetHeight(3);
        System.out.println(x.GetArea());
        Rectangle y = new Rectangle(10, 20);
        System.out.println(y.GetArea());
        System.out.println(x.GetArea() + y.GetArea());
    }
}