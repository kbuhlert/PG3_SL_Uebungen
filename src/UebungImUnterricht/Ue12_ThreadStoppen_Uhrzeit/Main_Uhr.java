package UebungImUnterricht.Ue12_ThreadStoppen_Uhrzeit;


public class Main_Uhr {

    public static void main(String[] args) {


        Worker_Uhr w1 = new Worker_Uhr();
        Thread t1 = new Thread(w1);

        System.out.println("Bitte drücken Sie eine Taste und Enter, um die Uhrzeit zu stoppen.");

        t1.start();

        String str = EingabeStopp.readLine2();
        System.out.println(str);

        if (str != null) {
            System.out.println("Programm wird beendet...");
            w1.requestShutDown();
        }
        try {
            t1.join();              //try-catch wird gefordert, muss generiert werden hgc
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
