package rvt;

import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ieraksti savu punktu skaitu (0-100):");

        int number = reader.nextInt();
            if (number <= 0) {
                System.out.println("Impossible!");
            }
            else if (number > 0 && number <= 49){
                System.out.println("Failed");
            }else if (number > 49 && number <= 59){
                System.out.println("1");
            }else if (number > 59 && number <= 69){
                System.out.println("2");
            }else if (number > 59 && number <= 69){
                System.out.println("2");
            }else if (number > 69 && number <= 79)
                System.out.println("3");
            else if (number > 79 && number <= 89){
                System.out.println("4");
            }else if (number > 89 && number <= 90){
                System.out.println("5");
            }else if (number >= 100){
                System.out.println("Incredible!");  
            }
            reader.close();
            
        }
}