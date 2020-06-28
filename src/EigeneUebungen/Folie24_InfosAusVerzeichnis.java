package EigeneUebungen;

import java.io.File;

public class Folie24_InfosAusVerzeichnis {

    public static void main(String[] args) {
        File verzeichnis = new File("C:\\Users\\kerst\\Downloads"); //C:\Users\kerst
        infosAusVerzeichnis(verzeichnis);
    }

    public static void infosAusVerzeichnis(File verzeichnis){
        long verzeichnisgroesze = 0;

        if(verzeichnis.isDirectory()){
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
