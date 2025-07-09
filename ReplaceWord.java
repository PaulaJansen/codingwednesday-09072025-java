import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) throws IOException {
        Scanner scannerInput = new Scanner(System.in);
        StringBuilder content = new StringBuilder();

        System.out.println("Welk woord wil je vervangen?");
        String input = scannerInput.nextLine();
        System.out.println("Voor welk woord?");
        String output = scannerInput.nextLine();

        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        boolean isWordReplaced = false;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.toLowerCase().contains(input)) {
                line = line.replace(input, output);
                isWordReplaced = true;
            }
            content.append(line).append(System.lineSeparator());
        }

        scanner.close();

        PrintWriter writer = new PrintWriter(new FileWriter("uitvoer.txt"));
        writer.print(content);
        writer.close();

        if (isWordReplaced) {
            System.out.println("Woord " + input + " is vervangen.");
        } else {
            System.out.println("Woord " + input + " is niet gevonden.");
        }

        scannerInput.close();
    }
}
