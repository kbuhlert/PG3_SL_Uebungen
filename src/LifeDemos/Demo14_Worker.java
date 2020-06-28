package LifeDemos;

public class Demo14_Worker implements Runnable {

    private char sign;

    public Demo14_Worker(char sign) {
        this.sign = sign;
    }

    @Override
    public void run() {

        for (int i=0; i<100;i++){
            System.out.println(Thread.currentThread().getName() +" "+sign + " " + i);
        }

    }
}
