package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue3_VerzeichnisFilesAusgeben {

    //File Properties = Demo2

    public static void main(String[] args) {
        //File Creation = Demo1 (File erstellen und Prüfen, ob erfolgreich erstellt)

        File testfile2 = new File("/");

        directoryContentAusgeben(testfile2);
    }


    public static void directoryContentAusgeben (File f){

        System.out.println("Im Verzeichnis der Datei sind folgende Dateien enthalten:");

        String[] fileListe = f.list();      //f.list() holt Namen (Strings!) der Files im Directory als Strings, deshalb brauchen wir als nächsten ein String-Array

        for(String einzelneFiles : fileListe) {
            if (f.isDirectory()) {
                System.out.println(einzelneFiles);
            }
            else {
                System.out.println("Die Datei ist ein Verzeichnis");
            }
        }
    }
}
