public class Triangle {
    private double length;
    private double width;
    private double height;

    // constructor to initialize the triangle with default values
    public Triangle() {
        this.length = 3;
        this.width = 4;
        this.height = 5;
    }

    // constructor to initialize the triangle with specific values
    public Triangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // setter method to change the length, width, and height of a triangle
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // public method to compute the area of a triangle
    public double computeArea() {
        double area = length * width * height;
        return area/2;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
