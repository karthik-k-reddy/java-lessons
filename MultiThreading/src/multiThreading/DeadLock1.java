package multiThreading;

public class DeadLock1 {

    public static void main(String[] args) throws InterruptedException {
        String lock1="lock1";
        String lock2="lock2";
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Lock1 on thread1");
                    synchronized (lock2){
                        System.out.println("Lock2 on thread1");
                    }
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Lock1 on thread2");
                    synchronized (lock1){
                        System.out.println("Lock2 on thread2");
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
//resource is held by one thread and blocks the access to another thread creating a deadLock situation
//In the above code, lock1 is acquired by thread1 and lock2 is acquired by thread2
//hence lock1 cannot be accessed by thread2 and lock2 cannot be accessed by thread1
//This created a deadlock situation and program goes into a dead state blocking any further execution