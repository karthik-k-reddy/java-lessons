package LambdaExpressions;

interface Omuni{
    void develop();
}
public class A1 {
    public static void main(String[] args) throws InterruptedException {
        /*Omuni omuni=new Omuni() {
            @Override
            public void develop() {
                System.out.println("Develop omni-channel product");
            }
        };*/

        Omuni omuni=()->{
            System.out.println("Develop omni-channel product");
            System.out.println("Develop for the future");
            int i=0;
            while (true){
                if(i<5) {
                    System.out.println(i);
                    i++;
                }
                else
                    break;
            }
        };
        Omuni omuni1=()-> System.out.println("ShipRocket1");
        Omuni omuni2=(()-> System.out.println("ShipRocket2"));

        omuni.develop();
        omuni1.develop();
        omuni2.develop();

        System.out.println();

       /* Thread thread1=new Thread(()-> System.out.println(Thread.currentThread().getName()));
        thread1.start();*/
       new Thread(()-> System.out.println(Thread.currentThread().getName())).start(); //lambda exp for single stmt

       //using lambda exp for creating thread and implement run()
        // Thread.currentThread().interrupt();  //interrupt current thread immediately
      //  Thread.currentThread().join(1000);  //wait for current thread execution for 1 sec if doesnot end then proceed with other stmt
        synchronized (Thread.currentThread()) {
            Thread.currentThread().wait(1000);  //wait for 1 sec and proceed
        }
        System.out.println();

        new Thread(()->{  //lambda exp for multiline stmts
            System.out.println(Thread.currentThread().getName());
            System.out.println("Stmt1");
            System.out.println("Stmt2");
            System.out.println("Stmt3");
        }).start();
    }
}


//lambda expression is used to provide method definition for interfaces having single method declaration
//functional-type interface-->interface having exactly one and only one abstract method eg: Runnable interface has only run()