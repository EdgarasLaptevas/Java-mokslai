
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFilesPerLine {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        String input = scanner.nextLine();

        List<String> fileStrings = read(input);

    }

    public static List<String> read(String file) throws IOException {
        Path path = Paths.get(file);
        return Files.lines(path).collect(Collectors.toList());

    }
}
