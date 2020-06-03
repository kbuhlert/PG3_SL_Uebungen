package LifeDemos;

import java.io.File;

public class Demo2_AusgabeSubordner {

    public static void main(String[] args) {
        //Ziel Ausgabe der Dateien und der enthaltenen Subordner

        File dir = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren2");
        listDirectory(dir.getAbsolutePath());

    }

    public static void listDirectory (String path){
        File root = new File(path);     //legt Startpunkt fest
        File[] list = root.listFiles();

        System.out.println("Ursprungspfad: " + path);

        if(list == null) return;

        for (File f:list){
            if(f.isDirectory()){
                listDirectory(f.getAbsolutePath());     //Rekursiver Aufruf der Methode wenn File keine Datei sondern Ordner ist
               System.out.println("Ditrectory: " + f.getAbsolutePath());
            }else{
                //wenn kein directory, dann ist es datei
                System.out.println("Datei: " + f.getAbsolutePath());
            }
        }
    }

}
