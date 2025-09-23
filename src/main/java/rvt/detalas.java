package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Bob's discounts Bolts pemero sadas cenas:");
        final int skruves_cena = 5;
        final int uzgrieznu_cena = 3;
        final int paplaksnu_cena = 1;

        System.out.println("Cik skruves velies iegadaties?");
            int skruves = reader.nextInt();

        System.out.println("Cik uzgrieznus velies iegadaties?");
            int uzgrieznu_sk = reader.nextInt();
        
        System.out.println("Cik paplaksnes velies iegadaties?");
            int paplaksnes_sk = reader.nextInt();

        int kopeja_summa = ( skruves_cena * skruves + uzgrieznu_cena * uzgrieznu_sk + paplaksnu_cena * paplaksnes_sk);

        
        if (skruves == uzgrieznu_sk && paplaksnes_sk == skruves * 2 ) {
            System.out.println("Pasutijums ir kartiba");
            System.out.println("Kopeja cena:" + kopeja_summa);
        }
        else if (skruves != uzgrieznu_sk && paplaksnes_sk != skruves * 2) {
            System.out.println("Parbaudi pasutijumu: par maz skruves vai uzgriezni un paplaksni.");
            System.out.println("Kopeja cena:" + kopeja_summa);
        }
        else if (skruves > uzgrieznu_sk) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu.");
            System.out.println("Kopeja cena:" + kopeja_summa);
        }
        else if (skruves < uzgrieznu_sk) {
            System.out.println("Parbaudi pasutijumu: par maz skruves.");
            System.out.println("Kopeja cena:" + kopeja_summa);
        }
        else if (paplaksnes_sk != skruves * 2) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu.");
            System.out.println("Kopeja cena:" + kopeja_summa);
        }
        reader.close();

    }
    
}
