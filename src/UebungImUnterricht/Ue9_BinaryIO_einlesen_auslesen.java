package UebungImUnterricht;

import java.io.*;

public class Ue9_BinaryIO_einlesen_auslesen {

    /*Schreiben Sie ein Programm, das ein String Objekt „Hallo Welt“ in
eine Datei „object.dat“ serialisiert und anschließend aus dieser
wieder ausliest und auf die Konsole schreibt.
Verwenden Sie die Klassen FileOutputStream und
ObjectOutputStream*/

    public static void main(String[] args) throws IOException {
        String s = "Hallo World";
        byte[] b = {'t','e','s','t'};

        File file = new File("Ue9_BinaryIO.dat");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for(char c:s.toCharArray()){   //String ist eigentlich CharArray und kann mit Methode toCharArray() entsprechend Zeichen für Zeichen gelesen werden
            objectOutputStream.write(c);
            System.out.println(c);
        }

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    //todo: Übung fertig machen. Ausgabe auf Konsole fehlt noch

}
