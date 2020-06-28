package UebungImUnterricht.Ue12_ThreadStoppen_Uhrzeit;

import java.util.Scanner;

public class EingabeStopp {

    public static String readLine2() {

        Scanner in = new Scanner(System.in);            //Einlesen der Konsolenbefehle mit Scanner + System.in
        String s = in.nextLine();

        System.out.println(s);

        try {
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
