package Chapter6;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
     SetWidth(width);
     SetHeight(height);
    }
    public Rectangle() {
        width = 0;
        height = 0;
    }

    public void SetWidth(double width) {
        this.width = width;
    }
    public void SetHeight(double height) {
        this.height = height;
    }
    public double GetWidth() {
        return width;
    }
    public double GetHeight() {
        return height;
    }
    public double GetArea() {
        return height * width;
    }
}
