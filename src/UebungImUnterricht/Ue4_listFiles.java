package UebungImUnterricht;

import java.io.File;

public class Ue4_listFiles {

    public static void main(String[] args) {

        File testfile = new File("C:\\Users\\kerst\\Dropbox\\Design\\Lightroom Presets\\Food\\Free Food Lightroom Presets");

        directoryContentAusgebenUndGroesze(testfile);
    }



    public static void directoryContentAusgebenUndGroesze (File f){

        System.out.println("Im Verzeichnis der Datei sind folgende Dateien enthalten:");

        File[] fileListe = f.listFiles();      //f.listFiles() holt File-Objekte im Directory und erstellt damit einen File-Array

        long directorygroesze = 0;

        for(File einzelneFiles : fileListe) {   //Datei-Objekte werden durchlaufen
            if (f.isDirectory()) {
                System.out.println(einzelneFiles.getName() + " -->Dateigroesze: " + einzelneFiles.length() + " byte");  //es wird der Name der Fil-Objete und deren Grosze ausgegeben
                directorygroesze += einzelneFiles.length();
                //an dieser Stelle wäre rekursiver Aufruf der Methode möglich mit Prüfung ob file == directory, dann werden subdirectories auch ausgelesen
            }
            else {
                System.out.println("Die Datei ist kein Verzeichnis");
            }
        }
        System.out.println("Verzeichnisgroesze: " + directorygroesze + "byte");
    }
}
