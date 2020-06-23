package UebungImUnterricht;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ue8_writeBinaryData_StoppX {
    //Lesen Sie Zeichen für Zeichen von der Konsole ein und schreiben
    //Sie die einzelnen Bytes in eine Datei.
    //Von der Konsole kann mittels System.in.read () ein Zeichen gelesen
    //werden
    //Brechen Sie ab, wenn ein ‘x‘ eingegeben wird

    public static void main(String[] args) throws IOException {
        String path = "Ue8_WriteAndStop.txt";   //wenn man in .dat-Datei schreibt, dann kann man die nur mit Rechtsklick + "Öffnen mit Notepad" öffnen
        File file = new File(path);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); //bufferedOutputStream wird im FileOutputStream gewarapped, da er deutlich bessere Laufzeiten hat. Das Ergebnis ist aber das Gleiche.

        while (true) {              //while-Schleife ist in Lösung von SH anders, diese ist aber auch korrekt
                                    //SH hat c in Scheife initialisiert
            char c = (char) System.in.read();                   //Zeichen wird eingelesen (Eingabe bekommt int) und zu char gecastet
            if (c == 'x') {                                      //Test ob Zeichen x (Abbruchbedingung) ist
                System.out.println("x wurde eingegeben. Prozess wird geschlossen");
                break;                                           //While-Schleife wird beendet wenn Zeichen = x
            }
            bufferedOutputStream.write(c);                         //Ansonsten wir Zeichen in Datei geschrieben
            System.out.println(c);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

    }

}
