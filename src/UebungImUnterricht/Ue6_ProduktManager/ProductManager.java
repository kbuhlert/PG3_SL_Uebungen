package UebungImUnterricht.Ue6_ProduktManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    /*
Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen.
    String ProductName
    Double Price
    String ProductCategory
    (+ Methoden: Getter / Setter / toString() / Constructor)
Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten Liste und implementieren Sie folgende Methoden
    public void add(Product p) ➔ fügt ein Produkt zur Liste hinzu
    public void saveToFile(String path) ➔ speichert die Produkte in der übergebenen Datei. -
        Realisieren Sie dies mittels BufferedWriter und Filewriter.
    public void readFromFile(String path) ➔ laden Sie den Text von der übergebenen Datei und geben Sie den Text auf der Konsole aus.
 */

    private List<Product> productList;

    public ProductManager() {
        productList  = new ArrayList<>();
    }

    public void add (Product p){
        productList.add(p);
    }

    public void saveToFile (String path) throws IOException {
        File f = new File(path);  //Datei wird im IntelliJ-Projekt angelegt
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for(Product p:productList){
            printWriter.println(p);
        }

        printWriter.flush();
        printWriter.close();
    }

    public void readFromFile (String path) throws IOException {

        FileReader fR = new FileReader(new File(path));
        BufferedReader buffR = new BufferedReader(fR);

        String line;

        while ((line = buffR.readLine()) != null){
            System.out.println(line);
        }

        buffR.close();

    }
}
