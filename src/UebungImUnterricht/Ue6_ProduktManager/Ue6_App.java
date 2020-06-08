package UebungImUnterricht.Ue6_ProduktManager;

import java.io.IOException;

public class Ue6_App {
    public static void main(String[] args) throws IOException {
        ProductManager prodMan = new ProductManager();

        String path = "Demo7_ProductManager.txt";

        Product p1 = new Product("Hose", 50.5, "Textil");
        Product p2 = new Product("Shirt",22.0, "Textil");
        prodMan.add(p1);
        prodMan.add(p2);
        prodMan.saveToFile(path);
        prodMan.readFromFile(path);
    }
}
