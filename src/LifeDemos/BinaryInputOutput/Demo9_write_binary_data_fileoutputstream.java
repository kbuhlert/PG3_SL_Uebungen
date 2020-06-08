package LifeDemos.BinaryInputOutput;

import java.io.*;

public class Demo9_write_binary_data_fileoutputstream {

    public static void main(String[] args) throws IOException {
        String path = "Demo8.txt";
        File file = new File (path);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String outputText = "Hello - my first Output";
        for(char c:outputText.toCharArray()){   //String ist eigentlich CharArray und kann mit Methode toCharArray() entsprechend Zeichen für Zeichen gelesen werden
            fileOutputStream.write(c);
            System.out.println(c);
        }

        fileOutputStream.flush();
        fileOutputStream.close();
    }

}
