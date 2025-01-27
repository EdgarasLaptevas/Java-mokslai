
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(readBooks(scanner.nextLine()));
        System.out.println(readBooks(scanner.nextLine()));
        // test your method here

    }


    public static List<Book> readBooks(String file) {
        String[] describeBook = file.split(",");
        if (describeBook.length != 4) {
            return books;
        }
        books.add(new Book(describeBook[0], Integer.parseInt(describeBook[1]), Integer.parseInt(describeBook[2]), describeBook[3]));
        return books;
    }

    @Override
    public String toString() {
//        return books.stream()
//                .map(Book::toString)
//                .collect(Collectors.joining("\n"));
        StringBuilder string = new StringBuilder();
        for (Book book : books) {
            string.append(book).append("\n");
        }
        return string.toString();
    }
}
