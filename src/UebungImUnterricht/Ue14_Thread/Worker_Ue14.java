package UebungImUnterricht.Ue14_Thread;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Worker_Ue14 {

    protected String name;
    protected boolean shouldRun;

    public Worker_Ue14(String name) {
        this.name = name;
        this.shouldRun = true;
    }

    protected abstract void work() throws IOException, InterruptedException;

    protected void printStarted(){
        System.out.print(name);
        System.out.println("--> wurde gestartet.");
    }

    protected void printStopped(){
        System.out.print(name);
        System.out.println("--> wurde gestoppt.");
    }

    public void stopWorker(){
        shouldRun = false;
    }

}
