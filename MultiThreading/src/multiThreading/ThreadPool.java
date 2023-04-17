package multiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool extends Thread{
    String name;

    public ThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting :"+ name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Terminating:"+name);
    }

    public static void main(String[] args) {

        ExecutorService executorService=Executors.newFixedThreadPool(2); //run threads in batches of 2

        Thread thread1=new ThreadPool("Thread1");
        Thread thread2=new ThreadPool("Thread2");
        Thread thread3=new ThreadPool("Thread3");
        Thread thread4=new ThreadPool("Thread4");
        Thread thread5=new ThreadPool("Thread5");
        Thread thread6=new ThreadPool("Thread6");
        Thread thread7=new ThreadPool("Thread7");
        Thread thread8=new ThreadPool("Thread8");
        Thread thread9=new ThreadPool("Thread9");
        Thread thread10=new ThreadPool("Thread10");
        Thread thread11=new ThreadPool("Thread11");
        Thread thread12=new ThreadPool("Thread12");

        executorService.submit(thread1); //run thread1
        executorService.submit(thread2);
        executorService.submit(thread3);
        try {
            thread2.join();    //wait until thread2 completes execution then proceed
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*
        executorService.submit(thread4);
        executorService.submit(thread5);
        executorService.submit(thread6);
        executorService.submit(thread7);
        executorService.submit(thread8);
        executorService.submit(thread9);
        executorService.submit(thread10);
        executorService.submit(thread11);
        executorService.submit(thread12);
        */

        executorService.shutdown(); //end the process of batch-wise thread execution
    }
}

//newFixedThreadPool(int) of Executors class offers to execute threads in batch[]
//submit(threadName) of ExecutorService  class allows to start the thread
// shutdown() of ExecutorService ends the process of execution of threads in batches