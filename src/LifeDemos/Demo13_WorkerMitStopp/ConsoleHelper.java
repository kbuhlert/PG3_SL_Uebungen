package LifeDemos.Demo13_WorkerMitStopp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleHelper {

    public static String readline() {

   /* InputStreamReader inputStreamReader = new InputStreamReader(System.in);     //Einlesen über Konsole mit inputStreamReader + system.in
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);*/

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

