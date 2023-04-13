package multiThreading;


import java.util.Random;

class Count {
    int counter;

    public Count(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
/*@Override
    public void run() {
        for (int i=1;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+"---->"+counter);
        }
    }*/
}
public class App_0 {

    public static void main(String[] args) throws InterruptedException {
       /* Thread thread=new Thread(new Count(1)); //thread class obj will take obj of class implementing run() as an argument
        Thread thread1=new Thread(new Count(2));
        long startTime=System.currentTimeMillis();
        thread.start();
        Thread.sleep(new Random().nextInt(500));
        thread1.start();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);*/

       int count= new Count(1).getCounter();
      Thread t1=  new Thread(new Runnable() {       //anonymous thread
            @Override
            public void run() {
                for (int i=1;i<10;i++){
                    try {
                        Thread.sleep(new Random().nextInt(5000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i+"---->"+count);
            }
        }
    });
      t1.start();
    }
}
