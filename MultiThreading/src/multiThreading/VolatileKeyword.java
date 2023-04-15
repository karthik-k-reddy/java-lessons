package multiThreading;
public class VolatileKeyword {

   volatile static int i=0;  //using volatile keyword with static variable because, sometimes caching mechanism can take over and update of static variable may be done using cache rather than thread
                            //to avoid update of static variable through caching , we use volatile keyword
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(i==0)
                        System.out.println("Running");
                    else
                        break;
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i=1;
                System.out.println("value of i updated successfully");
            }
        }).start();

    }

}
