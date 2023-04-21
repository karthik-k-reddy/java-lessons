package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLock {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        Lock lock=new ReentrantLock();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            lock.lock();  //allows only current thread execution after this point and blocks all other threads
            try {
                for (int i = 0; i < 1000; i++)
                    counter++;
            }finally {
                lock.unlock(); //releases all the locks on other threads and multi-threading allowed from this point onwards
            }
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            lock.lock();
            try{
            for(int i=0;i<1000;i++)
                counter++;
        }finally {
                lock.unlock();
            }
            }
    });

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();
        System.out.println(counter);

    }
}
