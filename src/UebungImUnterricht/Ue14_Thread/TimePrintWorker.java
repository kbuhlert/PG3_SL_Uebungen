package UebungImUnterricht.Ue14_Thread;

import java.util.Date;

public class TimePrintWorker extends Worker_Ue14 implements Runnable{
    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        printStarted();
        while (shouldRun) {
            try {
                work();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printStopped();
    }

    @Override
    protected void work() throws InterruptedException {
            Date d = new Date();
            System.out.println(d.toString());
            Thread.sleep(300);
    }
}
