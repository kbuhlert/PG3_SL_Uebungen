package EigeneUebungen;

import java.io.File;
import java.io.IOException;

public class Folie21_CreateNewFile {

    public static void main(String[] args) {
        File file1 = new File("Folie21_CreateNewFile.txt");

        try {
            if(file1.createNewFile())
            {System.out.println(file1.getName() + " / Datei konnte erstellt werden");}
            else {
                System.out.println("Datei existiert bereits");
            }
        } catch (IOException e) {
            System.out.println("Datei konnte nicht erstellt werden");
            e.printStackTrace();
        }
    }

}
