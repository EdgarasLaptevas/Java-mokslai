import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = reader.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(reader.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(reader.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        System.out.println("What information will be printed? ");
        String answer = reader.nextLine();

        for (Book book : books) {
            if (answer.equals("everything")) {
                System.out.println(book);
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
