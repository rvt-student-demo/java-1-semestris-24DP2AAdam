package rvt;

import java.util.Scanner;
import java.util.Random;
public class spele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random spele = new Random();
        System.out.println("Es domaju par skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin tris meginajumos ");

        int rezultats = spele.nextInt(11);

        System.out.println("Ievadi minejumu:");
        
        int skaitlis = 0;
        while (skaitlis != 3) {
            int ievade = input.nextInt();
            skaitlis += 1;

            if (rezultats == ievade) {
                System.out.println("Pareizi!");
                System.out.println("Tu esi uzvarejis speli!");
                break;
            }
            else{
                System.out.println("Nepareizi");
                continue;
                
            }
            
        }
        if (skaitlis == 3){
            System.out.println("Tu esi zaudejis speli.");
            System.out.println("Pareizais skaitlis bija " + skaitlis + ".");
        }
    
    }
            
    
}
