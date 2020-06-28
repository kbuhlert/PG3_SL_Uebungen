package LifeDemos.Demo13_WorkerMitStopp;

public class Worker implements Runnable{

    private boolean isRunning = true;       //ermöglicht die Abfrage ob Prozess weiter laufen soll, bzw. dass Prozess über setzen auf false abgeschaltet wird
    private char sign;                      //

    public Worker(char sign) {
        this.sign = sign;
    }

    public void requestShutDown(){      //wenn diese Methode Aufgerufen wird wird isRunning false, über diese Bedingung kann Prozess abgebrochen werden
        isRunning = false;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if (isRunning){              //for-Schleife wird Ausgeführt solange isRunning true ist, mit requestShutDown wird aus loop gegangen
                try {                   //Try/Catch wird durch sleep() automatisch eingefordert
                    Thread.sleep(1000);     //Verzögert die Schritte zwischen der Weiterabwicklung des Threads
                    System.out.println(i + " " + Thread.currentThread().getName() + " " + sign);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{break;}
        }

    }
}
