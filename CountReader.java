import java.util.Scanner;
import java.io.File;

public class CountReader {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        int count = 0;
        while (scanner.hasNext()) {
            scanner.next();
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
} 