package UebungImUnterricht.Ue14_Thread;

import java.io.*;
import java.util.ArrayList;

public class FileReadWorker extends Worker_Ue14 implements Runnable{

    private String path;
    public ArrayList<String> line;

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        this.line = new ArrayList<>();
    }

    @Override
    protected void work() throws IOException, InterruptedException {

        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String filetext;

        while ((filetext = bufferedReader.readLine()) != null) {
            if (shouldRun) {
                line.add(filetext);
                System.out.println(filetext);
                Thread.sleep(200);
            }else {break;}
        }
        bufferedReader.close();

    }

    @Override
    public void run() {
        try {
            printStarted();
            work();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        printStopped();

    }
}
