package multiThreading;

public class ThreadJoin {
    int count=0;
    public static void main(String[] args) {
        ThreadJoin threadJoin=new ThreadJoin();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    threadJoin.count++;
                }
            }
        });
      //  thread2.start();  -->This will not work because,threads do not behave like variables, order of initialisation is important
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i=0;i<1000;i++){
                    threadJoin.count++;
                }
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadJoin.count);
    }
}

//join() will wait exactly for that period of time the operation is going to take to complete
//join(2000) will wait for only 2000 Millis
//join(2000,50) will wait for only 2050 Millis