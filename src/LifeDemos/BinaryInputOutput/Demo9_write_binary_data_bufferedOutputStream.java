package LifeDemos.BinaryInputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9_write_binary_data_bufferedOutputStream {

    public static void main(String[] args) throws IOException {
        String path = "Demo8_Buffered.txt";
        File file = new File (path);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //bufferedOutputStream wird im FileOutputStream gewarapped, da er deutlich bessere Laufzeiten hat. Das Ergebnis ist aber das Gleiche.

        String outputText = "Hello - my first Output";
        for(char c:outputText.toCharArray()){   //String ist eigentlich CharArray und kann mit Methode toCharArray() entsprechend Zeichen für Zeichen gelesen werden
            bufferedOutputStream.write(c);
            System.out.println(c);
        }

        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

}
