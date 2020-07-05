package EigeneUebungen.Folie58_Produktmanager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager2 {

    List<Product> productList;

    public ProductManager2() {
        this.productList = new ArrayList<>();
    }

    public void add (Product p){
        productList.add(p);
    }

    public void save (String path){
        File file = new File("Folie58_2.txt");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,true));
            for(Product p : productList){
                objectOutputStream.writeObject(p);

            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> readFile(String path) throws IOException {
        ArrayList<Product> produktListe2 = new ArrayList<>();
        //File file = new File(path);
        ObjectInputStream inputStream = null;
        //int i;
        Product p;
        boolean mehrInhalt = true;
        inputStream = new ObjectInputStream(new FileInputStream(path));
        while (mehrInhalt){
        try {
                p = (Product) inputStream.readObject();
                System.out.println(p);
                if (p != null){
                    produktListe2.add(p);
                }else {
                    System.out.println("Einlesen beendet");
                    mehrInhalt = false;
                }
        } catch (Exception e) {
            e.printStackTrace();
            break;
        }
        }
        inputStream.close();
        return produktListe2;
    }


}
