package LifeDemos;

public class Demo14_WorkerDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable worker1 = new Demo14_Worker('A');
        Runnable worker2 = new Demo14_Worker('B');

        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);

        t1.start();
        t2.start();

        t1.join();      //wartet so lange bis thread fertig ist (run()-Abgeschlossen), dann erst thread tot
        t2.join();

        System.out.println("Fertig");

    }
}
