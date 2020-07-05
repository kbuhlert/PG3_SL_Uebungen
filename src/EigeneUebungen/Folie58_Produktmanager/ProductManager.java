package EigeneUebungen.Folie58_Produktmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    /*Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten Liste und implementieren Sie folgende Methoden
        public void add(Product p) ➔ fügt ein Produkt zur Liste hinzu
        public void saveToFile(String path) ➔ speichert die Produkte in der übergebenen Datei. -
            Realisieren Sie dies mittels ObjectOutputStream und FileOutputStream.
        public List<Product> readFromFile(String path)
            ➔ laden Sie das Object Product von der übergebenen Datei und
                geben Sie die Objecte mittels toString() auf der Konsole aus.
            Tipp:
                    -   arbeiten Sie beim auslesen der Dateien mit einer While Schleife
                    -   verwenden Sie readObject()
                    -   verwenden Sie einen try catch block, um die Exception: EOFException zu behandeln */
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList();
    }

    public void add(Product p) {
        products.add(p);
    }

    public void saveToFile(String path) {
        File produktFile = new File(path);
        try {
            FileOutputStream fo = new FileOutputStream(produktFile);
            ObjectOutputStream ois = new ObjectOutputStream(fo);
            for (Product p : products) {
                ois.writeObject(p);
                ois.flush();
            }
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Produkte wurden in Datei geschrieben");
    }

    public List<Product> readFromFile(String path) {
        ArrayList<Product> productsFromFile = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object neuesObjekt;
            while ((neuesObjekt = ois.readObject()) != null) {
                Product p = (Product) ois.readObject();
                productsFromFile.add(p);
                System.out.println(p + " wurde hinzugefügt");
            }
            ois.close();
            System.out.println("Einlesen beendet");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productsFromFile;
    }

}
