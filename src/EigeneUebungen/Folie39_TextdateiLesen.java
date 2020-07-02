package EigeneUebungen;

import java.io.*;

public class Folie39_TextdateiLesen {

    public static void main(String[] args) throws IOException {
        File file = new File("Demo5_PrintWriter1.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String fileText;
        while ((fileText=bufferedReader.readLine())!=null){     //wichtig: while-Schleife, damit alle Zeilen ausgelesen werden!
            System.out.println(fileText);
        }

        System.out.println("fertig");

        bufferedReader.close();

    }

}
