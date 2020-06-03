package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue2_Fileattribute {
    //File Properties = Demo2

    public static void main(String[] args) {
        File testfile1 = new File("Ue1_Fileattribute.txt");
        File testfile2 = new File("/");
        File fileObjekt = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\IntelliJ\\Programmieren3\\Files\\Ue1_FileErstellen.txt");

        fileAttributeAusgeben(testfile1);
        System.out.println("----");
        fileAttributeAusgeben(fileObjekt);

    }

    public static void fileAttributeAusgeben (File file1){

        if(file1.exists()) {     //wenn es die Datei gibt, dann folgende Attribute ausgeben
            System.out.println("Datei ist vorhanden: " + file1.exists());    //existiert File
            System.out.println("Dateiname: " + file1.getName());        //Name des Files
            System.out.println("Parent-Verzeichnis: " + file1.getParent());      // Parent-Directory ausgeben
            System.out.println("Pfad zum File: " + file1.getAbsolutePath());    //der Pfad zum File
            System.out.println("Ist Datei ein Verzeichnis: " + file1.isDirectory());        //ist das File ein directory/Verzeichnis
            System.out.println("Ist Datei eine Datei: " + file1.isFile());         // ist das File eine Datei
            System.out.println("Ist Datei lesbar: " + file1.canRead());        // ist die Datei lesbar
            System.out.println("Ist Datei nicht schreibgeschützt: " + file1.canWrite());       // kann die Datei beschrieben, verändert werden (Schreibschutz?)
            System.out.println("Datei hat folgende Größe: " + file1.length());         //welche Größe hat Datei
        }else {
            System.out.println("Diese Datei existiert nicht.");
        }

    }

}
