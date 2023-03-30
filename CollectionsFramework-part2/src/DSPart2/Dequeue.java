package DSPart2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque();
        deque.add(1); //add=addLast in deque
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addFirst(7);
        deque.addFirst(8);
        deque.offerFirst(9);
        deque.offerLast(10);
        deque.offer(11); //offer=offerLast in deque

        for(Integer i:deque){
            System.out.println(i);
        }
        System.out.println("**************************");
        deque.removeFirst();
        deque.removeLast();
        deque.remove(); //remove=removeFirst in deque
        deque.pollFirst();
        deque.pollLast();
        deque.poll();
        for(Integer i:deque){
            System.out.println(i);
        }
        System.out.println("**************************");


        System.out.println(deque.element());
        System.out.println(deque.peek()); //peek=peekFirst in deque
        System.out.println( deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
