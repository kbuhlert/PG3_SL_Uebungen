package EigeneUebungen;

import java.io.File;

public class Folie24_InfosAusVerzeichnis {
    /*Schreiben Sie eine Anwendung, die alle
Dateien eines Ordners sowie deren Größen
auf der Konsole ausgibt
Tipp: File.length () gibt einen Long Wert einer Datei
zurück. Und die Gesamtgröße aller Dateien (dieses
Ordners) berechnet sowie auf der Konsole
ausgibt*/

    public static void main(String[] args) {
        File verzeichnis = new File("C:\\Users\\kerst\\Downloads"); //C:\Users\kerst
        infosAusVerzeichnis(verzeichnis);
    }

    public static void infosAusVerzeichnis(File verzeichnis){
        long verzeichnisgroesze = 0;

        if(verzeichnis.isDirectory() && verzeichnis.exists()){
            File[] verzeichnisInhalt = verzeichnis.listFiles();
            for(File f : verzeichnisInhalt){
                System.out.println(f.getName());
                System.out.println(f.length());
                verzeichnisgroesze += f.length();
            }
            System.out.println("Größe des Verzeichnisses: " + verzeichnisgroesze);
        }else{
            System.out.println("Die Datei ist keine Verzeichnis");}

    }
}
