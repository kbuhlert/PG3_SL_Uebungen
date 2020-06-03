package LifeDemos;

import java.io.File;
import java.util.Scanner;

public class Demo1_DirectoryErstellen {
    public static void main(String[] args) {
        //mkdir() - creates directory
        //mkdirs() - creates Subdirectories directories, mit /dir1/dir2/dir3 köönnen in einem Ordner weitere Verzeichnisse angelegt werden


        System.out.println("Pfad des gewünschten Verzeichnis eingeben: ");

        Scanner scanner = new Scanner(System.in);   //scanner erwartet Eingabe durch Nutzer
        //erstelle Pfad. Bsp. C:\ ACHTUNG: Keine Sonderzeichen oder Leerzeichen und kein Extra-Backslash am Ende
        String path = scanner.next();   //Der String, der den Pfad angibt wird mit Hilfe des Scanners eingelesen, Pfad führt dahin, wo das neue Verzeichnis angelegt werden soll
        System.out.println("Name des gewünschten Verzeichnis eingeben: ");
        //Namen des neuen Verzeichnis mit Backslash am Anfang eingeben
        path = path+scanner.next(); //Der Pfad wird um den neuen Verzeichnisnamen erweitert

        //Create a File object, jedes File-Objekt hat einen Pfad als Attribut, das Erstellen des File-Objektes erstellt aber noch keine echte File
        File file = new File(path); //

        //Directory erstellen (file.mkdir()) und den Rückgabe-boolean speichern, damit mit "created" gecheckt werden kann ob erstellen funktioniert hat
       //das File-Objekt das oben erstellt wurde ("file") ruft Methode Directory-Erstellen auf. Diese Methode nimmt den Pfad, den das File-Objekt als Attribut hat und
        //erstellt damit ein neues Verzeichnis
        boolean created = file.mkdirs();    //todo: Fragen Unterschied Ordner-Verzeichnis-Datei
        //Überprüfen ob directory erstellt wurde:
        System.out.println(path);
        if (created){
            System.out.println("Directory was created");
        }
        else {
            System.out.println("Kein Verzeichnis. Erstellung nicht möglich");
        }
    }
}
