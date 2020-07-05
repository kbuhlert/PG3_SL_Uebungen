package EigeneUebungen.Folie90_Ueb2_CSV;

import org.w3c.dom.ls.LSOutput;

public class AdressExportException2 extends Exception{

    public AdressExportException2(Throwable cause) {
        super(cause);
        System.out.println("Adresse konnt nicht exportiert werden");
    }
}
