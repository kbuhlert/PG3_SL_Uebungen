package UebungImUnterricht.Ue12_ThreadStoppen_Uhrzeit;

import java.util.Date;

public class Worker_Uhr implements Runnable {

    private boolean isRunning = true;       //ermöglicht die Abfrage ob Prozess weiter laufen soll, bzw. dass Prozess über setzen auf false abgeschaltet wird
    private Date d = new Date();

    public void requestShutDown() {      //wenn diese Methode Aufgerufen wird wird isRunning false, über diese Bedingung kann Prozess abgebrochen werden
        isRunning = false;
    }

    @Override
    public void run() {

        while (true) {
            while (isRunning) {              //for-Schleife wird Ausgeführt solange isRunning true ist, mit requestShutDown wird aus loop gegangen
                try {                   //Try/Catch wird durch sleep() automatisch eingefordert
                    Thread.sleep(1000);     //Verzögert die Schritte zwischen der Weiterabwicklung des Threads
                    System.out.println(" " + d.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
