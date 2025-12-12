package rvt;

public class Overloadedcounter {
    public static void main(String[] args) {
        Counter c = new Counter(5);
        System.out.println("Initial value: " + c.value());

        c.increase();
        System.out.println("After increase(): " + c.value());

        c.decrease();
        System.out.println("After decrease(): " + c.value());

        c.increase(10);
        System.out.println("After increase(10): " + c.value());

        c.decrease(4);
        System.out.println("After decrease(4): " + c.value());
    }
    
    public static class Counter{
        private int number;
        public Counter(int startValue){
            this.number = startValue;
        }
        public Counter(){
            this.number = 0;
        }

        public int value(){
            return this.number;
        }
        public void increase(){
            this.number ++;
        }
        public void decrease(){
            this.number --;
        }
        public void increase(int increaseBy){
            if(increaseBy < 0){
                increaseBy = 0;
            }
            this.number += increaseBy;
        }
        public void decrease(int decreaseBy){
            if(decreaseBy < 0){
                decreaseBy = 0;
            }
            this.number -= decreaseBy;
        }


    }
}
