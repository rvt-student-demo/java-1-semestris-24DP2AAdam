package rvt;

import java.util.Scanner;

public class Chapter19 {
    public static void main(String[] args) {
        ex2();ex3();ex4();
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
    
        System.out.println(Sum);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println()
    }
}
