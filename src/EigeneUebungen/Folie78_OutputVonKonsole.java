package EigeneUebungen;

import java.io.*;

public class Folie78_OutputVonKonsole {
    public static void main(String[] args) {
        /*Lesen Sie Zeichen für Zeichen von der Konsole ein und schreiben
Sie die einzelnen Bytes in eine Datei.
Von der Konsole kann mittels System.in.read () ein Zeichen gelesen
werden
Brechen Sie ab, wenn ein ‘x‘ eingegeben wird*/

        File file = new File("Folie78_OutputVonKonsole");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            char c;
            System.out.println("text in Konsole eingeben");
            while ((c = (char) System.in.read()) != 'x') {
                fileOutputStream.write(c);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Eingabe beendet");
    }
}
