package LifeDemos.Demo7_ProductManager;

import UebungImUnterricht.Ue6_ProduktManager.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager2 {

    private List<Product2> productList;

    public ProductManager2() {
        productList  = new ArrayList<>();
    }

    public void add2 (Product2 p){
        productList.add(p);
    }

    public void saveToFile2 (String path)  {
        File f = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(Product2 p:productList){
            try {
                bufferedWriter.write(p.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.newLine();   //Umbruch in neue Zeile
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saving Done");
    }

    public void readFromFile2 (String path) throws IOException {
        //todo: TryCatch von SL-Code übernehmen und Finally ergänzen

        FileReader fR = new FileReader(new File(path));
        BufferedReader buffR = new BufferedReader(fR);

        String line;

        while ((line = buffR.readLine()) != null){
            System.out.println(line);
        }

        buffR.close();
        System.out.println("Datei fertig ausgelesen");

    }
}
