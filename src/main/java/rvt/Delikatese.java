package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi preci:");
        String prece = input.nextLine();

        System.out.println("Ievadi cenu:");
        double cena = input.nextDouble();
        double piegade = 0.00;

        System.out.println("Ekspress piegade (0 - ne, 1 - ja):");
        int ekspress_piegade = input.nextInt();

        if (ekspress_piegade == 1) {
            piegade += 3.00;   
        }

        if (cena < 10) {
            piegade += 2.00;

        }
        System.out.println("Rekins: " + "\n" + "\t" + prece + "\n" +"\t" + "Piegade " + piegade + "\n" + "\t" + "Kopa: " + (cena + piegade) );

        input.close();
        }
        
}
