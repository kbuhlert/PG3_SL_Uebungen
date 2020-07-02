package UebungImUnterricht.Ue14_Thread;

import java.io.FileReader;

public class Demo_Main {
    public static void main(String[] args) throws InterruptedException {
        TimePrintWorker tpw1 = new TimePrintWorker("Zeitgeber Heinz");
        FileReadWorker frw1 = new FileReadWorker("File Gerda", "Ue10_Umlaute.txt ");

        Thread t1 = new Thread(tpw1);
        Thread t2 = new Thread(frw1);

        t1.start();
        t2.start();

        t2.join();      //todo: Erklären was join hier macht. Warum wird Prozess nicht beendet? Warum zuerst t2.join()?
        tpw1.stopWorker();
        t1.join();



        System.out.println("Heinz und Gerda sind fertig");

    }
}
