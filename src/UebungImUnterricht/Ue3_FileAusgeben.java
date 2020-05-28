package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue3_FileAusgeben {
    public static void main(String[] args) {
        //File Creation = Demo1 (File erstellen und Prüfen, ob erfolgreich erstellt)

        File file1 = new File("UebungImUnterricht.txt");
        String fileSeparator = System.getProperty("file.separator");    //holt das File-Trennzeichen vom System und hängt dieses an( Windows"\")
        System.out.println("File Separator: " + fileSeparator);
        File file2 = new File("C:\\Users" + fileSeparator + "kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren 3\\test.txt");


        try {
            if(file1.createNewFile()){          //mit alt+Enter auf rot unterstrichenen drücken, dann oprion surround wirth try/catch
                System.out.println(file1.getAbsolutePath() + "is created" + file1.getName());
            } else {
                System.out.println("Pfad: " + file1.getAbsolutePath() + " Filename: " + file1.getName() + "File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if(file2.createNewFile()){          //mit alt+Enter auf rot unterstrichenen drücken, dann oprion surround wirth try/catch
                System.out.println("is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




        //


    }
}
