package UebungImUnterricht;

import java.io.File;
import java.io.IOException;

public class Ue1_FileErstellen {

    //File Properties = Demo2

    public static void main(String[] args) {
        File testfile1 = new File("Ue1_Fileattribute.txt");
        File testfile2 = new File("/");

        try {
            if (testfile1.createNewFile()) {          //mit alt+Enter auf rot unterstrichenen drücken, dann oprion surround wirth try/catch
                System.out.println(testfile1.getAbsolutePath() + "is created" + testfile1.getName());
            } else {
                System.out.println("Pfad: " + testfile1.getAbsolutePath() + " Filename: " + testfile1.getName() + "File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
