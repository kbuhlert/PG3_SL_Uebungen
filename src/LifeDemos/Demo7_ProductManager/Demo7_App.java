package LifeDemos.Demo7_ProductManager;

import UebungImUnterricht.Ue6_ProduktManager.Product;
import UebungImUnterricht.Ue6_ProduktManager.ProductManager;

import java.io.IOException;

public class Demo7_App {

    public static void main(String[] args) throws IOException {
        ProductManager2 prodMan = new ProductManager2();

        String path = "Demo7_ProductManager.txt";

        Product2 p1 = new Product2("Hose", 50.5, "Textil");
        Product2 p2 = new Product2("Shirt",22.0, "Textil");
        prodMan.add2(p1);
        prodMan.add2(p2);
        prodMan.saveToFile2(path);
        prodMan.readFromFile2(path);
    }
}
