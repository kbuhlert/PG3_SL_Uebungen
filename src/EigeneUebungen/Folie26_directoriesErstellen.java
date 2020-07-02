package EigeneUebungen;

import java.io.File;

public class Folie26_directoriesErstellen {
    /*Schreiben Sie eine Anwendung, die mehrere
Unterordner erstellt.
Tipp: File.mkdirs () verwenden
Zum Beispiel: campus02/ test /neu/
Dabei soll auch überprüft werden, ob diese Ordner
Struktur bereits schon existiert oder nicht.
Wenn nein, werden diese Ordner erstellt
Wenn ja, soll eine Konsolenmeldung ausgegeben werden*/

    public static void main(String[] args) {
        File directory = new File("Folie26_Directory/Unterordner/test2");
        directoriesErstellen(directory);

    }

    public static void directoriesErstellen(File directory){
        boolean neuesDirectory = directory.mkdirs();
    if(neuesDirectory && directory.isDirectory()){      //alternativ: if(directory.exists() && directory.isDirectory())
        System.out.println("directory wurde erstellt");
        }else{
        System.out.println("konnte nicht erstellt werden");
    }
    }

}
