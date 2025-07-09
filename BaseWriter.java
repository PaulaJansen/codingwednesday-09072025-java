import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class BaseWriter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        FileWriter writer = new FileWriter("uitvoer.txt");
        writer.write(input + "\n");
        writer.close();
        
        scanner.close();
    }
} 