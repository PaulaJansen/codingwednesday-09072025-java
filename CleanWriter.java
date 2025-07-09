import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class CleanWriter {
    public static void main(String[] args) throws IOException {
        System.out.println("Voer een tekst in voor het uitvoer.txt bestand  ");
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        PrintWriter writer = new PrintWriter(new FileWriter("uitvoer.txt", true));
        writer.println(input);
        writer.close();

        scanner.close();
    }
}
