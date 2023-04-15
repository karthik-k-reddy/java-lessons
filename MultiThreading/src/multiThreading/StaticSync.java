package multiThreading;


class App3{

    synchronized static void generate(int ThreadNo){
        for(int i=0;i<10;i++){
            if(i<6)
                System.out.print("[");
            else
                System.out.print("]");
        }
        System.out.print("generated by thread:"+ThreadNo);
        System.out.println();
    }
}
public class StaticSync {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                    App3.generate(1);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<5;i++)
                    App3.generate(2);
            }
        }).start();
    }
}