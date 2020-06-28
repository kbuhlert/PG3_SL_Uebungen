package UebungImUnterricht;

import java.io.*;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Ue10_Umlaut_EinlesenAuslesen {

    public static void main(String[] args) throws IOException {

        File file = new File("Ue10_Umlaute.txt");     //File in das Umlaute gelegt werden um zu gucken ob codierung funktioniert
        PrintWriter printWriter = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file); //notwendig um in File zu schreiben
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, ISO_8859_1);    //UTF_8 reinschreiben, das ist dann rot und unterkringelt, dann anklicken und auf import java.io.charset...
            printWriter = new PrintWriter(outputStreamWriter);
            printWriter.println("Köche koche Müsli äüö. Mit ISO-8859-1 Werden Umlaute nicht erkannt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            printWriter.flush();
            printWriter.close();
            System.out.println("Erfolgreich geschrieben");
        }

        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(file);       //weil wir kein Objekt und haben und eine txt-Datei, kann ich hier FileReader nehmen
            // und muss nicht zwingend FileInputStream + InputStreamReader nehmen
            bufferedReader = new BufferedReader(fileReader);

            String line;

            //geht mit Iteration Zeile für Zeile durch und liest diese aus, wenn nicht mehr in Zeile steht wird abgebrochen
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
            System.out.println("Datei fertig ausgelesen.");
        }

    }
}
