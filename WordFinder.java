import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        String input = scanner.nextLine();
        String word = "Java";
        if(input.contains(word)){
            System.out.println("Woord " + word + " gevonden: JA");
        } else {
            System.out.println("Woord " + word + " gevonden: NEE");
        }
    }
}
