package LifeDemos.BinaryInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo8_read_binary_data {

    public static void main(String[] args) throws IOException {

        String path = "datei.dat";
        File file = new File (path);

        FileInputStream fileInputStream = new FileInputStream(file);

        int byteRead;
        while ((byteRead = fileInputStream.read()) != -1){
            char[] ch = Character.toChars(byteRead);
            System.out.println(ch[0]);
        }

        fileInputStream.close();

    }
}
