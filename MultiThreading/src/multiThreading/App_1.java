package multiThreading;

public class App_1 {

    static int count=0;
    public static void main(String[] args) throws InterruptedException {
      Thread t1=  new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    count++;
                }
            }
        });
        Thread t2=  new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(500);
        System.out.println(count);
    }
}
