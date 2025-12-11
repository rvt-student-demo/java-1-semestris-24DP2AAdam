package rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average; 

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.average = 0 ;
    }

    public void addNumber(int number) {
        this.count ++ ;
        this.sum += number ;
        this.average = sum / count ;
    }

    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum ; 
    }

    public double average() {
        return this.average; 
    }
    public static void main(String[] args) {
        Statistics statistics  = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
