package LifeDemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3_BufferedReader {

    public static void main(String[] args) throws IOException {
        //File öffnen
        File file = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren3\\test.txt");
        //Liest die file aus
        FileReader fR = new FileReader(file);
        //Legt buffered reader über filereader zum komfortableren Auslesen --> FileReader liest zeichen für Zeichen
        //Buffered Reader liest Zeile für zeile (Zeichen werden im Buffer aufsummiert)
        //Der Puffer ermöglicht eine schnellere Laufzeit, da While-Schleife weniger oft durchlaufen werden muss (nur Zeilenweise
        //statt Zeichenweise)
        BufferedReader buffR = new BufferedReader(fR);

        String line;

        //geht mit Iteration Zeile für Zeile durch und liest diese aus, wenn nicht mehr in Zeile steht wird abgebrochen
        while ((line = buffR.readLine()) != null){
          System.out.println(line);
        }

        //Buffer Reader schließen
        buffR.close();

    }

}
