package multiThreading;

public class InterruptedThread {

    static int balance=999;
   synchronized void withdraw(int amount) throws InterruptedException {
        if(balance<=0 || balance<amount){
            try {
                System.out.println("Waiting for withdrawal!!!");
                wait();
            } catch (InterruptedException e) {
                System.out.println("waiting for deposit!!!");
            }
        }
        else{
            //wait();
            System.out.println("Total balance:"+balance);
            System.out.println("withdrawal amount:"+amount);
            System.out.println("balance after withdrawal:"+(balance-=amount));
        }
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
                try {
                    interruptedThread.withdraw(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.setName("THREAD-1");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
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
