package multiThreading;

class Banking{
    static int balance=0;
     void withdraw(int amount) {
        if(balance<=0) {
            System.out.println("Waiting for withdrawal");
            synchronized (this)   {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Withdrawal of rs "+amount+" is successful");
        System.out.println("remaining balance is rs "+(balance-amount));
    }
   void deposit(int amount){
        balance+=amount;
        System.out.println("rs "+amount+" deposited successfully");
       synchronized  (this) {
            notify();
        }
    }
}
public class WaitAndNotify {

    public static void main(String[] args) {
        Banking banking=new Banking();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                banking.withdraw(1000);
            }
        });
        thread1.setName("THREAD-1"); // renaming of thread for convenience
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                banking.deposit(5000);
            }
        });
        thread2.setName("THREAD-2");
        thread2.start();
    }
}

//wait() waits until notify()/notifyAll unlocks it
//wait() and notify()/notifyAll() must be enclosed within synchronized block
//notify()/notifyAll() can be called even inside run method of runnable interface or wherever suitable
//notify() will unlock the longest waiting thread and notifyAll() unlocks all the waiting threads
//wait()-->until notify()/notifyAll Unlocks it or some other thread interrupts it
//wait(2000)-->waits for 2000 seconds and proceeds further or until notify()/notifyAll Unlocks it or some other thread interrupts it
//wait(2000,50)-->waits for 2050 seconds and proceeds further or until notify()/notifyAll Unlocks it or some other thread interrupts it

