public class PaymentCard {
    private double balance;
    private String name;

//    public PaymentCard(double openingBalance) {
//        balance = openingBalance;
//    }

    public PaymentCard(String cardHolderName, double openingBalance) {
        balance = openingBalance;
        name = cardHolderName;
    }

    public String toString() {
        return name + ": The card has a balance of " + balance + " euros";

    }

    public void eatAffordably() {
        if (balance - 2.6 >= 0) {
            balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance - 4.6 >= 0) {
            balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        if (balance < 150 && amount > 0) {
            balance += amount;
            if (balance > 150) {
                balance = 150;
            }
        }
    }
}
