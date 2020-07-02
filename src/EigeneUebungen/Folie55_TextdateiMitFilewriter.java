package EigeneUebungen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Folie55_TextdateiMitFilewriter {
    /*
    print() Method
        print() - prints the specified data to the writer
        println() - prints the data to the writer along with a new line character at the end

    // Creates a PrintWriter using some character encoding
    PrintWriter output = new PrintWriter(String file, boolean autoFlush, Charset cs);
        Note: The PrintWriter class also has a feature of auto flushing.
            This means it forces the writer to write all data to the destination if
            one of the println() or printf() methods is called.
        close()	closes the print writer
        checkError()	checks if there is an error in the writer and returns a boolean result
        append()	appends the specified data to the writer
         */

    public static void main(String[] args) {
        File file = new File("Folie55_DateiMitPrintwriter");

        try {
            PrintWriter printwriter = new PrintWriter(new FileWriter(file, true),true);
            // der zweite Parameter (true) im Filewriter gibt an, das text in bestehender Datei nicht überschrieben sondern angehängt wird
            // der Parameter autoFlush im PrintWriter sorgt, dass nach em Schreiben immer ein flush() gemacht wird.

            for(int i=1; i<=5; i++) {
                printwriter.println(i + ". Zeile; die vom Printwriter angehängt wurde wurde");  //eingabe mehrer Zeilen
            }

            printwriter.flush();
            printwriter.close();
        } catch (IOException e) {
            System.out.println("Datei konnte nicht erstellt werden");
            e.printStackTrace();
        }

        System.out.println("Eingabe beendet");


    }
}
