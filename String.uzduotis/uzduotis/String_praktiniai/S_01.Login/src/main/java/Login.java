
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("alex");
        userNames.add("emma");

        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter username: ");
        String password = scanner.nextLine();

        for (int i = 0; i < userNames.size(); i++) {
            if (username.equals(userNames.get(i)) && password.equals(passwords.get(i))) {
                System.out.println("You have successfully logged in!");
                return;
            }
        }
        System.out.println("Incorrect username or password!");
        scanner.close();
    }
}
