package exercises.lsn1datatypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        double length = input.nextDouble();
        input.skip("\n");
        System.out.println("Enter width of rectangle:");
        double width = input.nextDouble();
        input.skip("\n");
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}
