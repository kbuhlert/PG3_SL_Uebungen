package EigeneUebungen.Folie90_Ueb2_CSV;

import UebungImUnterricht.Ue11_CSVexportierenEinlesen.Adress;
import UebungImUnterricht.Ue11_CSVexportierenEinlesen.AdressExportException;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdressManager {
    List<Adresse> adressListe = new ArrayList<>();

    public AdressManager() {
        this.adressListe = new ArrayList<Adresse>();
    }

    public List<Adresse> getAdressListe() {
        return adressListe;
    }

    public void add(Adresse a) {
        adressListe.add(a);
    }

    public void exportToCSV(String path, String separator) throws AdressExportException2, IOException, AdressExportFileAlreadyExists2Exception {
        /*Die Methode persistiert (mittels der kennengelernten Writer-Klassen) alle in der Liste abgelegten Adressen und speichert diese
        mit dem gegebenen Separator in eine Textdatei. Im Fehlerfall soll eine AddressExportException geworfen werden.
Ergänzung: Wenn die gegebene Datei bereits existiert, soll eine eigene Exception „AddressExportFileAlreadyExistsException“ werden.*/
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        /*if (file.exists()) {
            throw new AdressExportFileAlreadyExists2Exception("File existiert bereits");
        } else {*/
        for (Adresse a : adressListe) {
            bufferedWriter.write(a.getFirstname() + separator + a.getLastname() + separator + a.getMobilNumber());
            bufferedWriter.newLine();
        }
        //}
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void loadFromCSV(String path, String separator) throws IOException, AdressLoadException2, AdressFormatException {
        /*Diese Methode lädt (mittels der kennengelernten Reader-Klassen) eine Csv-Datei, welche Adress-Daten in folgenden Format zur Verfügung stellt.
        firstname;lastname;mobilenumber;email Das Trennzeichen (zwischen zwei Werten) kann ein beliebiger Separator
        (z.B.: ein Beistrich, ein Semikolon, ein Pipe, usw.) sein und wird als Parameter übernommen.
        Die Methode lädt alle Adressen und legt diese in der lokalen Liste ab. Im Fehlerfall soll eine eigene AddressLoadException
        geworfen werden.
        Ergänzung: Überprüfen Sie, ob die eingelesene Zeile 4 Spalten enthält. Werfen Sie im Fehlerfall eine AddressLoadWrongFormatException*/


        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Adresse> adressListeNeu = new ArrayList<>();
        String adressenString;

        while ((adressenString = bufferedReader.readLine()) != null) {
            String[] stringArray = adressenString.split(separator);
            if (stringArray.length != 3) {
                throw new AdressFormatException("Adresse hat nicht 3 Spalten");
            }
            adressListeNeu.add(new Adresse(stringArray[0], stringArray[1], stringArray[2], stringArray[0]));
        }
        bufferedReader.close();
        for (Adresse a : adressListeNeu) {
            System.out.println(a);
        }
    }


    }
