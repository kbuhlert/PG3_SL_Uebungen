package EigeneUebungen.Folie90_Ueb2_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdressManager2 {
    /*public void exportToCsv(String path, String separator) throws AddressExportException
    Die Methode persistiert (mittels der kennengelernten Writer-Klassen) alle in der Liste abgelegten
    Adressen und speichert diese mit dem gegebenen Separator in eine Textdatei. Im Fehlerfall soll eine
    AddressExportException geworfen werden.
    Ergänzung: Wenn die gegebene Datei bereits existiert, soll eine eigene Exception „AddressExportFileAlreadyExistsException“ werden.*/

    List<Adresse> adressliste2;

    public AdressManager2() {
        this.adressliste2 = new ArrayList<>();
    }

    public List<Adresse> getAdressliste2() {
        return adressliste2;
    }

    public void add2 (Adresse a){
        adressliste2.add(a);
    }

    public void exportToCsv(String path, String separator) throws AdressExportException2, IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try {
            if (file.exists()){
                throw new AdressExportFileAlreadyExists2Exception("Diese Datei existiert bereits und kann nicht überschrieben werden");
            }
        }catch (AdressExportFileAlreadyExists2Exception e){
            e.printStackTrace();
        }

        for (Adresse a: adressliste2){
            bufferedWriter.write(a.getFirstname() + separator + a.getLastname() + separator + a.getMobilNumber() + separator + a.getEmail());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /*public void loadFromCsv(String path, String separator) throws AddressLoadException
       Diese Methode lädt (mittels der kennengelernten Reader-Klassen) eine Csv-Datei, welche Adress-Daten in folgenden Format
       zur Verfügung stellt. firstname;lastname;mobilenumber;email Das Trennzeichen (zwischen zwei Werten) kann ein beliebiger
       Separator (z.B.: ein Beistrich, ein Semikolon, ein Pipe, usw.) sein und wird als Parameter übernommen.
        Die Methode lädt alle Adressen und legt diese in der lokalen Liste ab. Im Fehlerfall soll eine eigene AddressLoadException
        geworfen werden. Ergänzung: Überprüfen Sie, ob die eingelesene Zeile 4 Spalten enthält. Werfen Sie im Fehlerfall eine
        AddressLoadWrongFormatException*/
    public void loadFromCSV(String path, String separator) throws AdressLoadException2, IOException, AdressFormatException {

        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        adressliste2.removeAll(adressliste2);   //alle bisher in der Liste abgelegten Adressen werden gelöscht um Duplikate zu vermeidenc

        String eingeleseneAdressString;

        while ((eingeleseneAdressString = bufferedReader.readLine()) != null){
            String[] stringArray = eingeleseneAdressString.split(separator);
            if (stringArray.length != 4){
                throw new AdressFormatException("Adressen haben nicht 4 Spalten");
            }
            adressliste2.add(new Adresse(stringArray[0], stringArray[1], stringArray[2], stringArray[3]));
        }
        bufferedReader.close();

    }

}
