package EigeneUebungen;

import java.io.File;

public class Folie23_ListDirectories {

    public static void main(String[] args) {

        String systemTrennzeichen = System.getProperty("file.separator");
        File f = new File("\\");
        auflistungFilenamenImVerzeichnis(f);

    }

    public static void auflistungFilenamenImVerzeichnis (File f){

        if(f.exists() && f.isDirectory()){
            String[] fileListe = f.list();
        for(String filename : fileListe){
            System.out.println(filename);
        }}
        else {
            System.out.println(f + " ist kein Verzeichnis oder existiert nicht");
        }

    }


}
