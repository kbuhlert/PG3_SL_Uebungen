package UebungImUnterricht.Ue13_ThreadSynchro;

public class Main_Counter {

    public static void main(String[] args) throws InterruptedException {

        Counter c1 = new Counter();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        Object syn = new Object();


        t1.start();
        t2.start();


        /*synchronized (t1){
            System.out.println("Aufruf nächster thread");
            t1.notify();
            t1.wait();

        }
        synchronized (t2){
            System.out.println("Aufruf nächster thread");
            t2.notify();
        }*/
        t1.join();
        t2.join();
        System.out.println();
    }

}
