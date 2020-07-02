package LifeDemos.Demo16_URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadFromURL {
    public static void main(String[] args) {
        try {
        System.out.println("URL eingeben");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        URL url =  new URL(userInput.readLine());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String input;
        while ((input = bufferedReader.readLine()) != null){
            System.out.println(input);
        }


            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
