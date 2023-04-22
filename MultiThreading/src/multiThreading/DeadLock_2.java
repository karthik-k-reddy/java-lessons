package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock_2 {

    public static void main(String[] args) throws InterruptedException {
        Lock lock1=new ReentrantLock();
        Lock lock2=new ReentrantLock();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean lockFlag1 = false;
                boolean lockFlag2 = false;
                boolean done1 = false;
                boolean done2 = false;
                while (true) {
                    try {
                        if(!lockFlag1)
                            lockFlag1 = lock1.tryLock();
                        if(!lockFlag2)
                            lockFlag2 = lock2.tryLock();
                    } finally {
                        if (lockFlag1 && !done1) {
                            System.out.println("Lock1 on thread1");
                            lock1.unlock();
                            done1 = true;
                        }
                        if (lockFlag2 && !done2) {
                            System.out.println("Lock2 on thread1");
                            lock2.unlock();
                            done2 = true;
                        }
                        if(lockFlag1 && lockFlag2)
                            break;
                    }
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                boolean lockFlag1=false;
                boolean lockFlag2=false;
                boolean done1=false;
                boolean done2=false;
                while (true){
                try {
                    if(!lockFlag1)
                        lockFlag1 = lock1.tryLock();
                    if(!lockFlag2)
                        lockFlag2 = lock2.tryLock();
                }finally {
                    if(lockFlag1 && !done1) {
                        System.out.println("Lock1 on thread2");
                        lock1.unlock();
                        done1=true;
                    }
                    if(lockFlag2 && !done2) {
                        System.out.println("Lock2 on thread2");
                        lock2.unlock();
                        done2=true;
                    }
                    if(lockFlag1 && lockFlag2)
                        break;
                }
            }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("MAIN");
    }
}
