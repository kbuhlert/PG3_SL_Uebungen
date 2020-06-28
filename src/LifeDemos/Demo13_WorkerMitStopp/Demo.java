package LifeDemos.Demo13_WorkerMitStopp;

public class Demo {

    public static void main(String[] args) {


        Worker w1 = new Worker('A');
        Worker w2 = new Worker('B');

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        System.out.println("Bitte drücken Sie eine Tasten, um die Threads zu stoppen.");

        String str = ConsoleHelper.readline();
        System.out.println(str);

        if (str != null) {
            System.out.println("shutting down...");
            w1.requestShutDown();
            w2.requestShutDown();
        }

        try {
            t1.join();              //try-catch wird gefordert, muss generiert werden hgc
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
