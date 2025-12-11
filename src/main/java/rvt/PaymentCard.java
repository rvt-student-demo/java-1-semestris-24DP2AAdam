public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        while (this.balance >= 2.60) {
            this.balance -= 2.60;
            break;
        }
    }

    public void eatHeartily() {
        while (this.balance >= 4.60) {
            this.balance -= 4.60;
            break;
        }

    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
            if (amount < 0) {
                this.balance = this.balance;
            }
        }
    }

   
}
