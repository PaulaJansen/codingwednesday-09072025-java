import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountReaderLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        int count = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
