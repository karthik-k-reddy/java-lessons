package multiThreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(0);
                queue.put(Blockingqueue.counter++);
                System.out.println("added:"+Blockingqueue.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer  implements Runnable{

    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
       while (true) {
           try {
                Thread.sleep(3000);
               queue.take();
               System.out.println("removed:"+Blockingqueue.counter);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
public class Blockingqueue {

    static int counter=1;
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue(10);
        Producer producer=new Producer(queue);
        Consumer consumer=new Consumer(queue);
        Thread thread=new Thread(producer);
        thread.start();
        Thread thread1=new Thread(consumer);
        thread1.start();
    }
}
