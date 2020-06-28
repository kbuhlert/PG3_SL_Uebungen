package LifeDemos;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Demo12 {
    public static void main(String[] args) {

        File file = new File("Demo12_Umlaute.txt");     //File in das Umlaute gelegt werden um zu gucken ob codierung funktioniert
        PrintWriter printWriter = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file); //notwendig um in File zu schreiben
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8);    //UTF_8 reinschreiben, das ist dann rot und unterkringelt, dann anklicken und auf import java.io.charset...
            printWriter = new PrintWriter(outputStreamWriter);
             printWriter.println("Köche koche Müsli äüö");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            printWriter.flush();
            printWriter.close();
            System.out.println("Erfolgreich geschrieben");
        }


    }
}
