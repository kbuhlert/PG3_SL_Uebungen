package UebungImUnterricht.Ue11_CSVexportierenEinlesen;

public class AdressExportException extends Exception{

    public AdressExportException(Throwable cause){  //Throwable ist superklasse von allen Exceptions, kann ein String sein
        super(cause);
    }
}
