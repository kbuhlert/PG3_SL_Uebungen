package LifeDemos.Demo17_eigenerPortSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListenToClient {
    //wir als benutzer verninden uns zu server und tauschen uns mit server aus (Abfrage Zeit und Port)

    // todo: Programm starten und dann Eingabe per CommandLine (Commandfenster): "telnet localhost 9090"
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        ServerSocket server = null;     //ich bin Server und biete Verbindung an und warte auf Requests die über Netzwerk kommen
        Socket connectionToClient = null;   //ermöglicht kommunikation zum server/ ich bin client und möchte mich verbinden,
        // es können sich auch mehrere Clients (Sockets) mit Server (ServerSocket) verbinden.

        try {
            System.out.println("Warte...");
            server = new ServerSocket(9090);    //neuen Port erstellen mit ServerSocket-Objekt (damit machen wir eigenen Server, da Anfragen beantworten kann)
            connectionToClient = server.accept();       //zu diesem Server akkzeptieren wir verbindungen, verbindet client und server/ erst wenn der Socket den Port("server") akzeptiert wird dieser tatsächlich erstellt
            br = new BufferedReader(new InputStreamReader(connectionToClient.getInputStream())); //auslesen der Infos/Antwort vom Server
            bw = new BufferedWriter(new OutputStreamWriter(connectionToClient.getOutputStream()));  //schreiben auf Server

            bw.write("HELLO");
            bw.newLine();
            bw.flush();

            String command;
            while ((command = br.readLine()) != null) {     //wieso funktioniert eingabe über terminal, wenn keein system.in?
                if ("TIME".equals(command)) {
                    Calendar cal = GregorianCalendar.getInstance();
                    bw.write(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
                            + cal.get(Calendar.SECOND));
                    bw.newLine();
                    bw.flush();
                } else if ("PORT".equals(command)) {
                    bw.write("Port:" + connectionToClient.getPort());
                    bw.newLine();
                    bw.flush();
                } else if ("END".equals(command)) {
                    bw.write("Bye");
                    bw.newLine();
                    bw.flush();
                    break;
                } else {
                    bw.write("unknown command");
                    bw.newLine();
                    bw.flush();
                }
            }
            System.out.println("Beendet");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
