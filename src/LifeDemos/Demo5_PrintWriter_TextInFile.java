package LifeDemos;

import java.io.*;

public class Demo5_PrintWriter_TextInFile {
    public static void main(String[] args) throws IOException {

        File f = new File("Demo5_PrintWriter1.txt");  //Datei wird im IntelliJ-Projekt angelegt
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        //println schreibt zeilenweise in Dokument
        printWriter.println("first Line vom PrintWriter");
        printWriter.println("second Line vom PrintWriter"); //todo: Unterschied von printWriter.println(); .write(); .print();?
        printWriter.write("Methode write() wird ausgeführt");
        System.out.println(printWriter.checkError());   //todo: was macht checkerror(); ?
        printWriter.println('X');
        //zwischen .write() und .print() gibt es im Ergebnis keinen Unterschied
        printWriter.print("Und jetzt Methode print() im Vergleich");

        printWriter.flush();    //flush beendet Schreibvorgang ("Klospülung"), alles was im Puffer noch ist wird in file geschrieben/geflusht

        printWriter.close();    //muss geschlossen werden, ansonsten wäre Datei noch offen (->mögliche Komplikationen, wenn weiterer Writer auf Dokument zugreifen muss

        System.out.println("Fertig geschrieben, Writer geflusht und geschlossen");
    }
}
