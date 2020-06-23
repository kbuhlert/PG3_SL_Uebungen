package LifeDemos.BinaryInputOutput.Demo11;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> prodList;

    public ProductManager() {
        prodList = new ArrayList<Product>();
    }

    public void add(Product p){
        prodList.add(p);
    }

    public void save (String path) throws IOException {
        File file = new File(path);

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream); //ist nicht zwingend notwendig, erhöht aber die Effiziens
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        for(Product p : prodList){
            objectOutputStream.writeObject(p);      //mit jedem Durchgang wir ein File aus Liste in die Datei geschrieben, wenn nur ein Objekt in File müsste kann for Schleife weggelassen werden
        }

        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Produkte gespeichert");

    }

    public List<Product> load (String path) throws IOException, ClassNotFoundException{

        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Product> productList = new ArrayList<>();  //Produkte werden aus File in ArrayListe gelegt, diese wird dann ausgegeben

        Boolean cont = true;        //dient der Überprüfung ob in der File-Liste noch ein weiteres Produkt steht

        while (cont) {

            try {
            Product product = (Product) objectInputStream.readObject();

            if (product != null) {
                productList.add(product);
            } else {
                cont = false;
            }             //wenn kein Produkt mehr in Liste wird cont auf false gesetzt, damit wird dann auch while-Schleife beendet
        } catch (EOFException e){
                break;
            }

        }
        System.out.println("Read object data: ");
        System.out.println(productList);
        objectInputStream.close();
        return productList;
    }
}
