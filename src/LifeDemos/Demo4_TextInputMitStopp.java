package LifeDemos;

import java.io.*;
import java.util.Scanner;

public class Demo4_TextInputMitStopp {

    //Schreiben Sie ein Programm, das zeilenweise
    //Tastatureingaben auf die Konsole schreibt, bis
    //das Wort „STOP“ eingegeben wird.
    //Verwenden Sie dazu den InputStream System.in
    //Verwenden Sie weiters die Klassen:
    //
    //InputStreamReader und BufferedReader

    public static void main(String[] args) throws IOException {

        //File file = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren3\\test.txt");

        InputStream input = System.in;
        BufferedReader buffi = new BufferedReader(new InputStreamReader(input));
        String line = null;
        String stop = "STOP";

        while ((line = buffi.readLine()) != null){
            if (line.equals(stop)) {
                 break;
                 }
            System.out.println("Zeile zugefügt: " + line);
        }
        //Buffer Reader schließen
        buffi.close();

    }

}
