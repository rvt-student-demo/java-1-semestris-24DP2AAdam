package rvt; 
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of gift?");
            double gift_value = reader.nextDouble();

        if (gift_value < 5000) {
            System.out.println("No tax!");
        }
        else if (gift_value >= 5000 && gift_value < 25000) {
            double tax = 100 + (gift_value - 5000) * 0.08;
            System.out.println("Tax: " + tax);
        }
        else if (gift_value >= 25000 && gift_value < 55000) {
            double tax = 1700 + (gift_value - 25000) * 0.10;
            System.out.println("Tax: " + tax);
        }
        else if (gift_value >= 55000 && gift_value < 200000) {
            double tax = 4700 + (gift_value - 55000) * 0.12;
            System.out.println("Tax: " + tax);
        }
        else if (gift_value >= 200000 && gift_value < 1000000) {
            double tax = 22100 + (gift_value - 200000) * 0.15;
            System.out.println("Tax: " + tax);
        }
        else if (gift_value >= 1000000) {
            double tax = 142100 + (gift_value - 1000000) * 0.17;
            System.out.println("Tax: " + tax);
        }

        reader.close();
    }
}
