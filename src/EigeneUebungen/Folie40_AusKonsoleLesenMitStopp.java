package EigeneUebungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Folie40_AusKonsoleLesenMitStopp {
    /*Schreiben Sie ein Programm, das zeilenweise
Tastatureingaben auf die Konsole schreibt, bis
das Wort „STOP“ eingegeben wird.
Verwenden Sie dazu den InputStream System.in
Verwenden Sie weiters die Klassen:
InputStreamReader und BufferedReader*/



    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String text;
        System.out.println("Text in Konsole schreiben");
        while ((text=bufferedReader.readLine()) != null){
            if(text.equals("X")){
                System.out.println("Ausgabe wird beendet");
                break;
            }
            System.out.println(text);
        }
        bufferedReader.close();

    }
}
