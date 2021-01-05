package exercises.lsn1datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        double miles = input.nextDouble();
        System.out.println("Enter gallons of gas used:");
        double gas = input.nextDouble();
        double milesPerGallon = miles / gas;
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
