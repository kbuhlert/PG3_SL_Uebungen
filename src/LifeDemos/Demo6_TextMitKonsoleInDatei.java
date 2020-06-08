package LifeDemos;

import java.io.*;

public class Demo6_TextMitKonsoleInDatei {

    public static void main(String[] args) throws IOException {
        // Datei wird geöffnet und in PrintWriter gekapselt
        File file = new File("Demo6.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("Bitte geben Sie ihr Fach sowie Note ein:");
        // Unser Input kann empfangen werden
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // legt einen BufferedReader über den inputStreamReader.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // Zeile für Zeile wird eingelesen.
        String line;
        while (!(line = bufferedReader.readLine()).equals("STOP")) {
            // Mittels println(...) werden Zeilen geschrieben. Jede Zeile wird richtig abgeschlosen.
            printWriter.println(line);
            System.out.println(line);
        }
        // bufferedReader schließen
        bufferedReader.close();
        // flush() löst das Schreiben aus
        printWriter.flush();

    }


}
