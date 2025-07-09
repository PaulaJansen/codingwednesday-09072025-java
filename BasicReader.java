// Deze imports zijn nodig om Java te vertellen welke gereedschappen we gaan gebruiken
// Scanner = voor het lezen van bestanden, File = voor het werken met bestanden
import java.util.Scanner;
import java.io.File;

public class BasicReader {
    // Dit is het startpunt van het programma - Java zoekt altijd naar deze functie
    public static void main(String[] args) throws Exception {
        // Maak een "scanner" aan - dit is als een oog dat het bestand kan lezen
        // We vertellen de scanner om naar het bestand "uitvoer.txt" te kijken
        Scanner scanner = new Scanner(new File("uitvoer.txt"));
        
        // Zolang er nog regels in het bestand staan om te lezen...
        // hasNextLine() = "zijn er nog meer regels?"
        while (scanner.hasNextLine()) {
            // Lees de volgende regel en print deze direct op het scherm
            // nextLine() = "geef me de volgende regel uit het bestand"
            System.out.println(scanner.nextLine());
        }
        
        // Sluit de scanner - dit is belangrijk om het bestand netjes af te sluiten
        // Anders blijft het bestand "open" en kunnen andere programma's er niet bij
        scanner.close();
    }
} 