package EigeneUebungen;

import java.io.*;

public class Folie56_NotenInDateiMitStopp {
    /*
     Schreiben Sie ein Programm, das Ihre Noten aus allen Fächern im ersten Semester von der Konsole einliest und anschließend als „.txt“- Datei speichert.
     Z.B.: PR1: 1 Englisch: 1 •
     Die Eingabe endet, wenn das Wort „STOP“ eingegeben wird.
     Verwenden Sie die Klassen BufferedReader, InputStreamReader und FileWriter.
     */

    public static void main(String[] args) throws IOException {
        //Text einlesen
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //In File schreiben
        File file = new File("Folie56_NotenEinlesen");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fw);

        String eingabe;
        System.out.println("Noten in Konsole eingeben, mit x unterbrechen");
            try {
                while (!(eingabe = br.readLine()).equals("x")){
                    printWriter.println(eingabe);
                }
                printWriter.flush();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        System.out.println("Eingabe wurde beendet");
        }
}
