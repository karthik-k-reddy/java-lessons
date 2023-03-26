package Generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Generic1<K,V>{
    private K Key;
    private V Value;

    public Generic1(K key, V value) {
        Key = key;
        Value = value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return Value;
    }

    @Override
    public String toString() {
        return
                "Key="+Key+" Value="+Value;
    }
}
class Generic2<T>{
    private T type;

    public Generic2(T type) {
        this.type = type;
    }
    public T getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type: "+type;
    }
}
public class App<E, N> {
    public static void main(String[] args) {

        Generic1<String, Integer> generic = new Generic1<>("rcb", 1);
        System.out.println(generic);

        List<Generic2<String>> list = new LinkedList<>();
        list.add(new Generic2<>("one"));
        list.add(new Generic2<>("two"));
        list.add(new Generic2<>("three"));
        list.add(new Generic2<>("four"));
        list.add(new Generic2<>("five"));


        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Iterator<Integer> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
            Iterator<Generic2<String>> iterator1 = list.listIterator();
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }
            new App<String,Integer>().genericMethod("RCB",143);
    }

  void genericMethod(E element,N number){
        System.out.println(element+" "+number);
    }
}
