package multiThreading;


class CountMe extends Thread{
    private int count;

    public CountMe(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            printCount();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printCount() throws InterruptedException{
        for (int i=1;i<10;i++){
            System.out.println("i= "+i+" thread :"+ getCount());
            Thread.sleep(1000);
        }
    }

}
public class App {
    public static void main(String[] args)  {

       long startTime= System.currentTimeMillis();
        new CountMe(1).start();
        System.out.println("********************************");
        new CountMe(2).start();
        System.out.println("********************************");
        new CountMe(3).start();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
