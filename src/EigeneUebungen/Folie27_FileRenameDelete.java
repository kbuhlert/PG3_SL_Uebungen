package EigeneUebungen;

import java.io.File;
import java.io.IOException;
import java.util.jar.JarOutputStream;

public class Folie27_FileRenameDelete {
    /*Tip: use delete(File file), renameTo (File dest)
Create a Method
which creates 10 Files
save all File Information in a List
renames all files (print to console original name +
name after renaming. Example test.txt --> test_neu.txt
+ Status
delete all files and print filename and the status of
the deletion.*/
    //todo:   Methode fertig stellen (rename and delete), erfragen was mit "save all File Information in a List" gemeint war.
    public static void main(String[] args) {
        fileRenameDelete();
    }

    public static void fileRenameDelete(){

        for(int i = 1; i<=5; i++){
            String dateiname = "Folie26_Directory\\Uebung_Folie27_" + i + ".txt";
            File file = new File(dateiname);
            try {
                boolean fileexists = file.createNewFile();
                if(fileexists){
                    System.out.println(file.getName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }




}
