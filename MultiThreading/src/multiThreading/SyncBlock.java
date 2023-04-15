package multiThreading;


class Counter{

    private Object Lock="lock";
    void generate(){
        synchronized (Lock) {                   //synchronized block on object
            for (int i = 1; i < 11; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (i < 6)
                    System.out.print("[");
                else
                    System.out.print("]");
            }
            System.out.println();
        }
        for (int i=1;i<11;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SyncBlock {
     static Counter counter=new Counter();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                long start=System.currentTimeMillis();
                for (int i=1;i<6;i++)
                    counter.generate();
                System.out.println("thread1: "+(System.currentTimeMillis()-start));
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                long start=System.currentTimeMillis();
                for (int i=1;i<6;i++)
                    counter.generate();
                System.out.println("thread2: "+(System.currentTimeMillis()-start));
            }
        }).start();
    }
}
//approx time for both threads without any synchronized method/block:2000 Millis  (use when no synchronization is needed)
//approx time for both threads with synchronized method:3000 Millis:3000 Millis   (use when complete logic in method needs to be synchronized )
//approx time for both threads with synchronized block:3000 Millis:2100 Millis    (recommended approach when only a part of method needs to be synchronized )
//make use of synchronization on object to ensure privacy of Lock rather than using 'this' keyword