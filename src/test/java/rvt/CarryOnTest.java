package rvt;

import java.util.Scanner;

public class CarryOnTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String input = reader.nextLine();
                if (input.equals("no")) {
                    break;
                } 
        }
        reader.close();
    }

}
