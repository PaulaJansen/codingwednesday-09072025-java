import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Find word: ");
        String input = scannerInput.nextLine();

       boolean contains = false;
        while (scanner.hasNextLine()){
            String word = scanner.nextLine();
            if(word.contains(input)){
                System.out.println("Woord " + input + " gevonden: JA");
                contains = true;
                break;
            }
        }

        if(!contains){
            System.out.println("Woord " + input + " gevonden: NEE");
        }
        scanner.close();
        scannerInput.close();
    }
}
