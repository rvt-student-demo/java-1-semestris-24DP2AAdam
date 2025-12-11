package rvt;

public class Advanced_astrology {
    public static void main(String[] args){
    printTriangle(4);
    }
    public static void printSpaces(int number){
        for (int i = 0; i < number ; i++) {
            System.out.print(" ");
        }
        
    }
    public static void printStars(int number){
        for (int i = 0; i < number; i++) {
            System.out.print("*");
            
        }
        System.out.println();
    }
    public static void printTriangle(int size){
        for (int i = 1; i < size + 1; i++) {
            printSpaces(size - i);
            printStars(i);

        }
    }
}
