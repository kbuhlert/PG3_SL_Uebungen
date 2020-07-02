package EigeneUebungen.Folie58_Produktmanager;

public class Folie58_main {
    public static void main(String[] args) {
        ProductManager prodMan = new ProductManager();
        prodMan.add(new Product("Shirt",50.20, "Leiberln"));
        prodMan.add(new Product("Jeans",70.20, "Hosen"));
        prodMan.add(new Product("Krawatte",15.00, "Accesoires"));

        prodMan.saveToFile("Folie58_ProduktManager.txt");
        prodMan.readFromFile("Folie58_ProduktManager.txt");
    }
}
