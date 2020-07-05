package LifeDemos;

public class Demo14_Worker implements Runnable {

    private char sign;
    private static Object lock = new Object();

    public Demo14_Worker(char sign) {
        this.sign = sign;
    }

    @Override
    public void run() {

        synchronized (lock){
        for (int i=0; i<100;i++){
            System.out.println(Thread.currentThread().getName() +" "+sign + " " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}

    }
}
