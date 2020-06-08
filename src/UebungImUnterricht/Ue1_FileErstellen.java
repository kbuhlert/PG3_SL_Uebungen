package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue1_FileErstellen{

    public static void main(String[] args) {
        //File Creation = Demo1 (File erstellen und Prüfen, ob erfolgreich erstellt)

        File file1 = new File("UebungImUnterricht.txt");
        String fileSeparator = System.getProperty("file.separator");    //holt das File-Trennzeichen vom System und hängt dieses an( Windows"\"),
                                                // andere Systeme haben aber andere Trennzeichen, wenn im Pfad ein die Trennzeichen als String stehen,
                                                //dann kann das evtl nicht auf allen Systemen korrekt ausgelesen werden
        System.out.println("File Separator: " + fileSeparator);
        File file2 = new File("C:\\Users" + fileSeparator + "kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren 3\\test.txt");


        try {
            if(file1.createNewFile()){          //mit alt+Enter auf rot unterstrichenen drücken, dann option surround wirth try/catch
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

        //File direct mit Exception und Pfad erstellen

        try {
            File fileObjekt = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\IntelliJ\\Programmieren3\\Files\\Ue1_FileErstellen.txt");
            if(fileObjekt.createNewFile()){          //mit alt+Enter auf rot unterstrichenen drücken, dann oprion surround wirth try/catch
                System.out.println("File erstellt: " + fileObjekt.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Erstellen der Datei");
            e.printStackTrace();
        }


    }
}
