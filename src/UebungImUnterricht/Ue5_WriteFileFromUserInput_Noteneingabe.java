package UebungImUnterricht;

import java.io.*;

public class Ue5_WriteFileFromUserInput_Noteneingabe {
    //ACHTUNG ist inkorrekt, funktioniert nicht!!!!

    public static void main(String[] args) throws IOException {

      File file = new File("Ue5_Noteneingabe.txt");

        FileWriter fileWriter = new FileWriter(file ,true);     // new FileWriter(file ,true) - falls die Datei bereits existiert
                                                                    // werden die Bytes an das Ende der Datei geschrieben

        PrintWriter printWriter = new PrintWriter(fileWriter);  //Todo: Warum müssen wir FileWriter mit PrintWriter wrappen?
        System.out.println("Bitte Noten eingeben und mit Return abschliessen.\n('STOP' beendet das Programm.)");

        BufferedReader tastatureingabe = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = tastatureingabe.readLine()) != null){
            fileWriter.write(line);  // Text wird in den Stream geschrieben
            //todo: Warum kann hier line eingegeben werden und nicht tastatureingabe
            fileWriter.write(System.getProperty("line.separator")); //fügt die Art des zeilenumbruchs ein, die vom Betriebssystem genutzt wird
            fileWriter.flush();
            if (line.equals("STOP")) {
                break;
            }

            System.out.println("Zeile zugefügt: " + line);
        }
        //Buffer Reader schließen
        tastatureingabe.close();


    }



}
