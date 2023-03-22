package linkedLists;

import java.util.LinkedList;

public class A1 {
   static LinkedList<String> phones=new LinkedList<>();

    public static void main(String[] args) {
        phones.add("iphone");
        phones.add("vivo");
        phones.add("mi");
        phones.add("nokia");
        System.out.println(phones);
        phones.remove(); //removes first element in the list
        System.out.println(phones);
        phones.add(0,"iphone"); //add at specified position
        System.out.println(phones);
        phones.remove(2);//remove element at specified position
        System.out.println(phones);
        phones.remove("vivo");//remove specified element
        System.out.println(phones);
        phones.set(0,"Iphone");// modify element at specified position
        System.out.println(phones);
        System.out.println("******************************");
        for (String s:phones){
            System.out.println(s);
        }
        System.out.println( phones.isEmpty());//if empty returns true, else false
        phones.push("1+");
        System.out.println(phones);
        System.out.println(phones.peek());
        System.out.println(phones.poll());//removes and displays topmost element
        System.out.println(phones);
    }
}
