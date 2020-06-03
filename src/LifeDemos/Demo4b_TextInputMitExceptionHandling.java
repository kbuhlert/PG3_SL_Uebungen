package LifeDemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo4b_TextInputMitExceptionHandling {

    public static void main(String[] args) {

        //siehe ExceptionHandling - CatchInsideFinally

        //File file = new File("C:\\Users\\kerst\\Dropbox\\Softwareentwicklung\\Vorlesungen\\Programmieren3\\test.txt");

        InputStream input = System.in;
        BufferedReader buffi = new BufferedReader(new InputStreamReader(input));
        String line = null;
        String stop = "STOP";

        //in dem Fall gibt es nicht wirklich viele Fehlerquellen/Exceptions, da Eingabe direkt und nicht aus File/in File. Aber der BufferedReader,
        //bzw. die readLine()-Methode erfordern immer ein Exception-Handling

        try {
            while ((line = buffi.readLine()) != null) {
                if (line.equals(stop)) {
                    break;
                }
                System.out.println("Zeile zugefügt: " + line);
            }
            //in dem Fall ist das Auftreten einer Excception sehr unwahrscheinlich
        } catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
            ioe.printStackTrace();
        } finally {

            //der Try-Catch-Block im Finally stellt sicher, dass der Versuch den Buffer Reader zu schließen nicht zu einem
            // Fehler führt, falls der BufferReader nicht korrekt erstellt wurde (=null)
            try {
                if (buffi != null) {
                    buffi.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }


}
