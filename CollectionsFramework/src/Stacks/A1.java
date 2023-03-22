package Stacks;

import java.util.Stack;

public class A1 {

    static Stack<String> names=new Stack<>();

    public static void main(String[] args) {
       // System.out.println(names.peek()); //EmptyStackException
        System.out.println(names.isEmpty()); //true if empty, false if not empty
       // System.out.println(names.empty());
        names.push("jaguar");
        names.push("ferrari");
        names.push("lamborghini");
        names.push("bmw");
        names.push("audi");
        System.out.println(names);
        System.out.println(names.peek());
        names.pop();
        System.out.println(names+"\n");

        for(String s:names){
            System.out.println(s);
        }

        System.out.println(names.search("bmw"));
        names.add("xyz"); //append at last
        names.add(1,"abc");// append at specified position
        names.add("cloud");
        names.pop();
        System.out.println(names);

    }
}
