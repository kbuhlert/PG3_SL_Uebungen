package LifeDemos.Demo18_MehrereClientThreads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

class ListenToMultipleClient {
    public static void main(String[] args)
    {
        ServerSocket server = null;
        Socket connectionToClient = null;
        List<Thread> clients = new ArrayList<Thread>(); //Liste von Threads, jeder Client der reinkommt wird hier abgelegt
        try
        {
            System.out.println("Starte Server");
            server = new ServerSocket(9090);
            server.setSoTimeout(30000);     //Verbindung besteht nur für 30sec, dann server nicht mehr ansprechbar, Programm würde auch ohne Timeout funkrionieren
            while (true)
            {       //in dieser while-Schleife akkzeptieren wir server und erstellen thread, der serversocket übergibt/ neu anlegt
                try
                {
                    connectionToClient = server.accept();
                    Thread t = new Thread(new CommunicationTask(connectionToClient));
                    t.start();
                    clients.add(t); //thread wird in Arraylist gelegt, um übersicht darüber zu habe, welche Clients sich zi Server verbunden haben
                }
                catch (SocketTimeoutException timeout)
                {
                    System.out.println("Timeout");
                    break;
                }
            }

            for (Thread t : clients)
                t.join();

            System.out.println("Beende Server");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

