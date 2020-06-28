package LifeDemos;

public class Demo13_RunnableExample implements Runnable {

    private String name;

    /*public Demo13_RunnableExample(String name) {
        this.name = name;
    }*/

    public static void main(String[] args) {
        System.out.println("Inside: "  + Thread.currentThread().getName());

        System.out.println("New Runnable kreieren");
        Runnable runnable = new Demo13_RunnableExample();   //erstelle/ instaanziiere Runnable-Objekt (kann Methode run() aufrufen)

        System.out.println("Thread erstellen");
        Thread thread = new Thread(runnable);   //Erstelle Thread mit runnable-Objekt, Status New

        System.out.println("Start Thread");
        thread.start();     //wenn Thread gestarted ist, geht er in run-Methode

    }

    @Override
    public void run() {
        System.out.println("Inside new Thread: "  + Thread.currentThread().getName());
    }
}
