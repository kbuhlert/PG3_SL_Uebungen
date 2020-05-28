package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue2_Fileattribute {
    //File Properties = Demo2

    public static void main(String[] args) {
        File testfile1 = new File("Ue1_Fileattribute.txt");
        File testfile2 = new File("/");

        try {
            if(testfile1.createNewFile()){          //mit alt+Enter auf rot unterstrichenen drücken, dann oprion surround wirth try/catch
                System.out.println(testfile1.getAbsolutePath() + "is created" + testfile1.getName());
            } else {
                System.out.println("Pfad: " + testfile1.getAbsolutePath() + " Filename: " + testfile1.getName() + "File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileAttributeAusgeben(testfile1);
        System.out.println("----");
        directoryContentAusgeben(testfile2);

    }

    public static void fileAttributeAusgeben (File file1){

        System.out.println("Existiert Datei: " +  file1.exists());    //existiert File
        System.out.println("Dateiname: " + file1.getName());        //Name des Files
        System.out.println("Parent-Verzeichnis: " + file1.getParent());      // Parent-Directory ausgeben
        System.out.println("Pfad zum File: " + file1.getAbsolutePath());    //der Pfad zum File
        System.out.println("Ist Datei ein Verzeichnis: " + file1.isDirectory());        //ist das File ein directory/Verzeichnis
        System.out.println("Ist Datei eine Datei: " + file1.isFile());         // ist das File eine Datei
        System.out.println("Ist Datei lesbar: " + file1.canRead());        // ist die Datei lesbar
        System.out.println("Ist Datei nicht schreibgeschützt: " + file1.canWrite());       // kann die Datei beschrieben, verändert werden (Schreibschutz?)
        System.out.println("Datei hat folgende Größe: " + file1.length());         //welche Größe hat Datei

    }

    public static void directoryContentAusgeben (File f){

        System.out.println("Im Verzeichnis der Datei sind folgende Dateien enthalten:");

        String[] fileListe = f.list();      //f.list() holt Namen der Files im Directory als Strings

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
