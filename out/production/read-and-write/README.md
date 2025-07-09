# Coding Wednesday Challenge: Read & Write

## Over deze Challenge
Dit is een Coding Wednesday challenge die focust op het leren van basis bestandsinvoer en -uitvoer (I/O) in Java. Vandaag leren we hoe we tekst kunnen schrijven naar bestanden maar ook lezen van bestanden.

## Wat doet de code?

### Huidige Bestanden:
- **BaseWriter.java** - Leest input van de console en schrijft het naar `uitvoer.txt`
- **CleanWriter.java** - Leest input van de console en schrijft het naar `uitvoer.txt`, maar elke input komt netjes op een nieuwe regel
- **BasicReader.java** - Leest de inhoud van `uitvoer.txt` en toont het op de console
- **CountReader.java** - Telt alle woorden in `uitvoer.txt` en toont het totaal

### Hoe te gebruiken:
1. Compile: `javac BaseWriter.java`
2. Run: `java BaseWriter`
3. Type tekst in de console en druk Enter


# OPDRACHT
## Uitbreidingen/Features bouwen

### 1. **Regel Teller**
**User Story:** Ik wil weten hoeveel regels er in mijn bestand staan.

**Input:** Geen input nodig (leest automatisch uitvoer.txt)
**Output:** Aantal regels in het bestand

**Voorbeeld:**
```
Input: java LineCounter
Output: 
Aantal regels: 5
```

**Hint:** Gebruik een `while` loop met `hasNextLine()` en tel elke regel.

---

### 2. **Woord Zoeker**
**User Story:** Ik wil zoeken naar een woord in mijn bestand.

**Input:** Een woord dat je wilt zoeken
**Output:** Of het woord gevonden is of niet

**Voorbeeld:**
```
Input: java WordFinder
Zoek naar woord: Java
Output: 
Woord "Java" gevonden: JA
```

**Hint:** Gebruik `contains()` om te checken of een regel het woord bevat.

---

### 3. **Tekst Vervanger**
**User Story:** Ik wil een woord vervangen door een ander woord.

**Input:** Oud woord en nieuw woord
**Output:** Bevestiging dat het vervangen is

**Voorbeeld:**
_Input_
```
Java
Door: Python
```

_Output_
```
Woord vervangen!
```

**Hint:** Gebruik `replace()` om woorden te vervangen in een String.

---

### 4. **Tekst Sorteren**
**User Story:** Ik wil alle woorden alfabetisch sorteren.

**Input:** Geen input nodig
**Output:** Gesorteerde woorden op de console

**Voorbeeld:**
```
Input: java TextSorter
Output: 
a
bestand
java
tekst
woorden
```

**Hint:** Gebruik `ArrayList` om woorden op te slaan en `Collections.sort()` om te sorteren.

---

### 5. **Statistieken**
**User Story:** Ik wil basis statistieken over mijn tekst.

**Input:** Geen input nodig
**Output:** Aantal woorden en regels

**Voorbeeld:**
```
Input: java Statistics
Output:
Woorden: 15
Regels: 5
```

**Hint:** Tel woorden met `scanner.next()` en regels met `scanner.nextLine()`.

## Leerdoelen
- Bestandsinvoer en -uitvoer in Java
- Scanner klasse gebruiken
- Loops en conditionals
- String manipulatie
- Basis algoritmes (tellen, zoeken, sorteren)

## Tips voor Studenten
- Begin klein en bouw stap voor stap uit
- Test je code met verschillende soorten tekst
- Denk na over edge cases (lege bestanden, speciale tekens)
- Documenteer je code met comments
- Deel je oplossingen en help elkaar!
- Gebruik `System.out.println()` voor duidelijke output
- Test met verschillende bestandsgroottes# read-and-write-java
