package multiThreading;

public class InterruptedThread {

    static int balance=1999;
   synchronized void withdraw(int amount)  {
        if(balance<=0 || balance<amount){
            try {
                System.out.println("waiting for deposit!!!");
                wait();
            } catch (InterruptedException e) {
               System.out.println("THREAD-1 interrupted");
            }
        }
       System.out.println("Total balance:"+balance);
       System.out.println("withdrawal amount:"+amount);
       System.out.println("balance after withdrawal:"+(balance-=amount));
    }
     void deposit(int amount){
        balance+=amount;
        System.out.println("Rs "+amount+" is deposited successfully");
        System.out.println("balance after deposit:"+balance);

    }
    public static void main(String[] args)  {
        InterruptedThread interruptedThread=new InterruptedThread();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                interruptedThread.withdraw(1000);
            }
        });
        thread1.setName("THREAD-1");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                interruptedThread.deposit(10000);
            }
        });
        thread2.setName("THREAD-2");
        thread2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.interrupt();
    }
}
