package multiThreading;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class SomeThread extends Thread {

    private CountDownLatch latch;

    public SomeThread(CountDownLatch  latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Running thread:"+Thread.currentThread().getName()); //get the system-name of thread currently running
        System.out.println("Thread terminated");
        System.out.println("*****************************************");
        latch.countDown(); //unfolds the lock everytime the run() is executed
    }
}
    class App4{
    public static void main(String[] args) {

        CountDownLatch latch=new CountDownLatch(4);  //applies the lock 4 times on the threads

        SomeThread thread1=new SomeThread(latch);
        SomeThread thread2=new SomeThread(latch);  //thread creation using CountDownLatch type parameter
        SomeThread thread3=new SomeThread(latch);
        SomeThread thread4=new SomeThread(latch);

        thread1.start();
        thread2.start();   //starting thread
        thread3.start();
        thread4.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("MAIN-THREAD");
    }
}
