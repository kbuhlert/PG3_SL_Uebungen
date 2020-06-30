package UebungImUnterricht.Ue13_ThreadSynchro;

public class Counter implements Runnable {

    public int counter = 1;
    public int repeats = 20;

    private static Object lock = new Object();




    @Override
    public void run() {
        synchronized (lock) {
           // for (int i = 1; i <= repeats; i++) {  -->Funktioniert nicht, hier übernimmt thread2 und zählt weiter bis 40
            while (counter<=repeats) {

                System.out.println(Thread.currentThread().getName() + "---" + counter++);

                try {
                    Thread.sleep(200);     //Verzögert die Schritte zwischen der Weiterabwicklung des Threads

                    lock.notify();  //muss vor dem wait liegen --> benachrichtigt folgenden thread und weckt den auf
                    lock.wait();    // aktueller thread geht in wait()-Zustand, wartet darauf, dass er bei der nächsten Schleifen-Iteration wieder geweckt wird

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll();   //gibt alle threads nach der while-Schleife frei, ansonsten verbleibt ein thead im .wait() und Programm wird nicht beendet
            }
        }

    }
}
