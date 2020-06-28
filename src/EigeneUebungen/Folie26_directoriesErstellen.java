package EigeneUebungen;

import java.io.File;

public class Folie26_directoriesErstellen {

    public static void main(String[] args) {
        File directory = new File("Folie26_Directory/Unterordner/test");
        directoriesErstellen(directory);

    }

    public static void directoriesErstellen(File directory){
        boolean neuesDirectory = directory.mkdirs();
    if(directory.exists() && directory.isDirectory()){
        System.out.println("directory wurde erstellt");
        }else{
        System.out.println("konnte nicht erstellt werden");
    }
    }

}
