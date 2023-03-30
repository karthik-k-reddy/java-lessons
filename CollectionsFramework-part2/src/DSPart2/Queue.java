package DSPart2;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue=new ArrayBlockingQueue(5);
        try{
        System.out.println(queue.poll()+queue.remove()+queue.peek()+ queue.element());
        }
        catch (NoSuchElementException e){
            System.out.println("queue is empty");
        }
try {
    System.out.println( queue.add("one"));
    queue.add("two");
    queue.add("three");
    queue.add("four");
    System.out.println(  queue.add("five"));
    System.out.println( queue.add("six"));
}
catch (IllegalStateException e){
    System.out.println("queue is full");
}


        System.out.println(queue.offer("one"));//true if add is success else false
        System.out.println(queue.remove());
        System.out.println(queue.offer("one"));
        System.out.println(queue.poll());
        System.out.println("\n"+queue.peek() +"\n"+ queue.element()+"\n");

        for (String str:queue){
            System.out.println(str);
        }

       }
    }

  /*
    add(e)--> offer(e) adds element at the end of the queue
    remove() -->poll()   removes first element in the queue
    peek()-->element()     returns first element in the queue
*/

