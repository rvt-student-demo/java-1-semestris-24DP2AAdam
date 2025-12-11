package rvt;

public class Divisible_by_three {
    public static void main(String[] args){

        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int start, int end){
        for (int i = start; i <= end; i++) {
            if ( i % 3 == 0) {
                System.out.println(i);
            }
        }

    }


}
