package InlämmningsUppgift;

import java.util.Scanner;
public class TextApp {
    public static void main(String[] args) {
        TextAnalysis analysis = new TextAnalysis(); // Instans av TextAnalysis
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");

        String input;

        do {
            input = scanner.nextLine();

            // Kontrollera om "stop" har skrivits
            if (analysis.shouldStop(input)) {
                break;
            }

            // Uppdatera statistiken med inmatningen
            analysis.updateStatistics(input);

        } while (true);

        scanner.close();

        // Skriv ut resultaten
        System.out.println("Antal rader: " + analysis.getLineCount());
        System.out.println("Antal tecken: " + analysis.getCharacterCount());
        System.out.println("Antal ord: " + analysis.getWordCount());
        System.out.println("Längsta ord: " + analysis.getLongestWord());
    }
    }




