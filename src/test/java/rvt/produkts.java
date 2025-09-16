package rvt;

import java.util.Scanner;

public class produkts {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
//string, double, int
        String nosaukums = ievade.nextLine();

        double cena = ievade.nextDouble();

        int skaits = ievade.nextInt();

        System.out.println("Produkts: " + nosaukums + "\n" + "cena: " + cena + "\n" + "skaits: " + skaits);
        System.out.println("Totalprice: " + skaits * cena);
        ievade.close();

    }
    
}
