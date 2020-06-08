package UebungImUnterricht;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ue7_BinaerDateiLesen_Zeichenzahlausgeben {

    //Schreiben Sie ein Programm, welches von
    //einer Datei alle Zeichen einfließt und auf der
    //Konsole ausgibt.
    //Zählen Sie die Anzahl der eingelesenen
    //Zeichen und geben Sie die Gesamtanzahl am
    //Ende aus.
    public static void main(String[] args) throws IOException{
        System.out.println(readBinary());
    }

    public static int readBinary () throws IOException{

        String path = "Demo6.txt";
        File file = new File (path);

        FileInputStream fileInputStream = new FileInputStream(file);

        int byteRead;
        int count = 0;
        while ((byteRead = fileInputStream.read()) != -1){  //todo: abklären warum hier int byteRead und int-1
            char[] ch = Character.toChars(byteRead);
            System.out.println(ch[0]);
            count++;
        }
        fileInputStream.close();
        return count;

    }
}
