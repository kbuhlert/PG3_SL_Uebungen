package EigeneUebungen.Folie58_Produktmanager;

import java.io.IOException;

public class Folie58_main {
    public static void main(String[] args) throws IOException {
        ProductManager prodMan = new ProductManager();
        prodMan.add(new Product("Shirt",50.20, "Leiberln"));
        prodMan.add(new Product("Jeans",70.20, "Hosen"));
        prodMan.add(new Product("Krawatte",15.00, "Accesoires"));

        //prodMan.saveToFile("Folie58_ProduktManager.txt");
        //prodMan.readFromFile("Folie58_ProduktManager.txt");

        ProductManager2 productManager2 = new ProductManager2();
        productManager2.add(new Product("Shirt",50.20, "Leiberln"));
        productManager2.add(new Product("Jeans",70.20, "Hosen"));
        productManager2.add(new Product("Krawatte",15.00, "Accesoires"));

        productManager2.save("Folie58_2.txt");
        productManager2.readFile("Folie58_2.txt");

    }
}
