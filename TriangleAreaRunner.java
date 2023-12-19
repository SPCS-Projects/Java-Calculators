import java.util.Scanner;

public class TriangleRunne {
    public static void main(String[] args) {
        // create a Triangle object using the first constructor
        Triangle t1 = new Triangle();

        // calculate and print the area of the triangle using the computeArea() method
        double t1Area = t1.computeArea();
        System.out.println("Triangle 1:");
        System.out.println("Area: " + t1Area);

        Scanner input = new Scanner(System.in);

        // create a Triangle object using the second constructor
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        Triangle t2 = new Triangle(length, width, height);

        double t2Area = t2.computeArea();
        System.out.println("\nTriangle 2:");
        System.out.println("Area: " + t2Area);

        t2.setLength(1);
        t2.setWidth(2);
        t2.setHeight(8);

        // print out the dimensions of the triangle using the getter methods
        System.out.println("\nTriangle 2 Updated:");
        System.out.println("Length: " + t2.getLength());
        System.out.println("Width: " + t2.getWidth());
        System.out.println("Height: " + t2.getHeight());
        System.out.println("Area: " + t2.computeArea());
    }
