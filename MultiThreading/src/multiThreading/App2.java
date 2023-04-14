package multiThreading;


class Bracket{
    synchronized public void generate(){  //synchronised block
        for(int i=1;i<=10;i++){
            if(i<=5)
                System.out.print("[");
            else
                System.out.print("]");
        }
        System.out.println();
    }
}
public class App2 {

    public static void main(String[] args) {
        Bracket bracket1=new Bracket();
        Bracket bracket2=new Bracket();
        //synchronized block applies lock specific to object,it will nullify sync while running threads for different objects
        // synchronisation is ensured for threads using same object
       // bracket.generate();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=3;i++){
                bracket1.generate();
            }
        }
    }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=3;i++){
                    bracket2.generate();
                }
            }
        }).start();
}
}
