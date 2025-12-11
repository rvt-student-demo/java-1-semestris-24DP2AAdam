package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex1(); ex2(); ex3(); ex4(); ex5(); ex5(); ex6(); ex7();
    }

    public static void ex1() {
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
    }

    public static void ex2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = input.nextInt();

        int Sum = 0;

        while (N > 0) {
            Sum = Sum + N;
            N = N - 1;
        }
        System.out.println("Sum = " + Sum);

    }

    public static void ex3() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = input.nextInt();

        int Sum = 0;

        while (N > 0) {
            Sum = Sum + N * N;
            N = N - 1;
        }
        System.out.println("Sum = " + Sum);
    }

    public static void ex4() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter low:");
        int low = input.nextInt();
        
        System.out.println("Enter high");
        int high = input.nextInt();

        int Sum = 0;
        while(low < high + 1) {
            Sum = Sum + low;
            low = low + 1;
        }
    
        
            System.out.println("Sum = " + Sum);

       
        }

        public static void ex5() {
            Scanner reader = new Scanner(System.in);

            System.out.println("Enter a word: ");
                String word = reader.next();


                int times;
                times = word.length();


                System.out.println(times);


        }

        public static void ex6(){
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter first word ");

            String word = reader.nextLine();
            System.out.println("Enter second word ");

            String word2 = reader.nextLine();
            int dotAmount = 30 - word.length() - word2.length();
            String dots = "";
            for (int i = 1; i < dotAmount; i++) {
                dots += ".";
        }
            System.out.println(word + dots + word2);
    }
        public static void ex7(){
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();
            int len = word.length();
        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }
        input.close();

    }

}
