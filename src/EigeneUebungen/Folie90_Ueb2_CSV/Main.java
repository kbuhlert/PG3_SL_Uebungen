package EigeneUebungen.Folie90_Ueb2_CSV;

import UebungImUnterricht.Ue11_CSVexportierenEinlesen.Adress;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "Folie90_Ue2_CSV.csv";
        String seperator = ";";
        AdressManager am = new AdressManager();
        Adresse a1 = new Adresse("Robert", "Leitner", "0660", "Robert.leitner@outlook.com");
        Adresse a2 = new Adresse("Sabine", "Leitner", "0660", "Sabine.leitner@outlook.com");
        Adresse a3 = new Adresse("Christopher", "Leitner", "0660", "Christopher.leitner@outlook.com");
        Adresse a4 = new Adresse("Horst", "Leitner", "0660", "Horst.leitner@outlook.com");

        am.add(a1);
        am.add(a2);
        am.add(a3);
        am.add(a4);

        try {
            am.exportToCSV(filePath, seperator);
        } catch (AdressExportException2 adressExportException2) {
            adressExportException2.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AdressExportFileAlreadyExists2Exception e) {
            e.printStackTrace();
        }

        try {
            am.loadFromCSV(filePath, seperator);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AdressLoadException2 e){
            e.printStackTrace();
        } catch (AdressFormatException e){
            e.printStackTrace();
        }

        System.out.println(am.getAdressListe().toString());


    }
}
