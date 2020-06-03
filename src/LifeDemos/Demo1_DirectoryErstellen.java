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
        String path = scanner.next();
        System.out.println("Name des gewünschten Verzeichnis eingeben: ");
        //Namen des neuen Verzeichnis mit Backslash am Anfang eingeben
        path = path+scanner.next(); //Nächste Eingabe startet

        //Create a File object
        File file = new File(path);

        //Überprüfen ob directory:
        boolean created = file.mkdirs();
        System.out.println(path);
        if (created){
            System.out.println("Directory was created");
        }
        else {
            System.out.println("Kein Verzeichnis. Erstellung nicht möglich");
        }
    }
}
