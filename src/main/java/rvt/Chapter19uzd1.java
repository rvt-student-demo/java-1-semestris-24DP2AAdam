package rvt;
import java.util.Scanner;

public class Chapter19uzd1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start value:");
            int skaitlis1 = input.nextInt();
        System.out.println("Enter end value:");
            int skaitlis2 = input.nextInt();
            System.out.println(" ");

        while (skaitlis1 < skaitlis2){
            System.out.print(skaitlis1 + "\n");
            skaitlis1 = (skaitlis1 + 1);

        }
        System.out.println(skaitlis2);
        input.close();
    }
    
}