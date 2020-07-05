package EigeneUebungen;

import java.io.*;

public class Folie72_BinäreDateninFileScheiben {

    public static void main(String[] args) {
        File file = new File("Folie72_BinärdatenSchreiben");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            PrintStream printStream = new PrintStream(fileOutputStream);

            String text = "Printstream Daten in Datei schreiben";

            for (char c : text.toCharArray()){
                printStream.write(c);
            }
            printStream.flush();
            printStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Text wurden mit PrintStream in Datei geschrieben");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String text = "BufferedStream Daten in Datei schreiben";

            for (char c : text.toCharArray()){
                bufferedOutputStream.write(c);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Text wurden mit BufferedStream in Datei geschrieben");



    }

}
