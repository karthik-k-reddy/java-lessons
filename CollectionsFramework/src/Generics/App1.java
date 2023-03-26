package Generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Info<T>{
    private Object obj;

    public Info(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return " "+obj;
    }
}
public class App1 {
    public static void main(String[] args) {

        List <Info<Integer>> list=new LinkedList<>();
        list.add(new Info("str"));
        list.add(new Info(1));
        list.add(new Info(1.4f));
        list.add(new Info(2.005d));
        list.add(new Info('c'));
        list.add(new Info(true));
        new App1().printList(list);
    }

    void printList(List<Info<Integer>> list){
        Iterator<Info<Integer>> iterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
