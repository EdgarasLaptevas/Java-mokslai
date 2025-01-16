import java.security.PublicKey;

public class MainProgram {

    public static void main(String[] args) {

        PaymentCard paulsCard = new PaymentCard("Paul", 20);
        PaymentCard mattsCard = new PaymentCard("Matt", 30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard);
        System.out.println(mattsCard);
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
