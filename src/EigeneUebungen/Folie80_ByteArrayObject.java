package EigeneUebungen;

import java.io.*;

public class Folie80_ByteArrayObject implements Serializable {

    public static void main(String[] args) {
        /*
    Schreiben Sie ein Programm, das ein String- Objekt „Hallo Welt“ in eine Datei „object.dat“ serialisiert und anschließend aus dieser wieder ausliest und auf die Konsole schreibt.
    Verwenden Sie die Klassen FileOutputStream und ObjectOutputStream sowie FileInputStream und ObjectInputStream
    Verwenden Sie für das Schreiben die Methode writeObject(…), für das Lesen die Methode readObject(). Beim Lesen müssen Sie das Ergebnis in einen String casten
    Betrachten Sie die Datei in einem Editor (Notepad, Notepad++)
     */

        String object = "Hallo Welt";
        byte[] byteArray = {'I', 'c', 'h', ' ', 'b', 'i', 'n','s'};
        File file = new File("Folie80_ObjectInput.dat");

        try {
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream(file));  //file wird überschrieben wenn Methode nochmal ausgeführt wird

            objectOutputStream.writeObject(object);
            objectOutputStream.writeObject(byteArray);

            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            String ausgabe = (String) objectInputStream.readObject();       //Das liest nur den ersten String aus, nicht das byteArray, muss aber gecastet werden, da in Datei nur Bytes
            System.out.println(ausgabe);

            byte[] byteAuslesen= (byte[]) objectInputStream.readObject();   //liest nur das ByteArray aus, muss zum Auslesen als byteArray gecastet werden gecastet werden
            String byteString = new String(byteAuslesen);                   //aus Bytearra muss dann noch ein String gemacht werden
            System.out.println(byteString);

            objectInputStream.close();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
