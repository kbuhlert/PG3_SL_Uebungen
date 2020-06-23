package LifeDemos.BinaryInputOutput;

import java.io.*;

public class Demo10_BinaryIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String s = "Hallo World";
        byte[] b = {'t','e','s','t'};

        File file = new File("Demo10.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

       //in file schreiben
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(b);
        objectOutputStream.flush();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        System.out.println("" + (String) ois.readObject());     //hier müsste eigentlich nicht als String gecastet werden, da Objekt ja bereits ein String ist

        byte[] read = (byte[]) ois.readObject();

        String s2 = new String(read);
        System.out.println("" + s2);



    }

}
