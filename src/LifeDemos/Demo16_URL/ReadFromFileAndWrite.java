package LifeDemos.Demo16_URL;

import java.io.*;
import java.net.URL;

public class ReadFromFileAndWrite {

    public static void main(String[] args) {
        try {
            System.out.println("URL eingeben");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); //Eingabe der URL über Konsole (system.in)
            URL url =  new URL(userInput.readLine());   //URL-Objekt
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream())); //BuffReader holt sich mittels URL-Objekt den Seitencontent

            File file = new File("Demo16_ReadURLAndWrite");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));   //SL hat hier Printwriter genommen, geht beides, PrintWriter braucht keinen Filewriter

            String input;
            while ((input = bufferedReader.readLine()) != null){
                System.out.println(input);
                bufferedWriter.write(input);
                bufferedWriter.flush();
            }

            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Schreiben beendet.");

    }


}
