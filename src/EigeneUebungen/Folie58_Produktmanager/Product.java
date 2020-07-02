package EigeneUebungen.Folie58_Produktmanager;

import java.io.Serializable;

public class Product implements Serializable {
    /*
    Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen.
        String ProductName
        Double Price
        String ProductCategory
        Tipp:
            implements Serializable verwenden
            getter, setter, tostring, constructor erstellen*/
    String productName;
    Double price;
    String productCategory;

    public Product(String productName, Double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
