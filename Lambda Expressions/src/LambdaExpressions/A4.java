package LambdaExpressions;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Info{
    private  String name;
    public Info(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
   /* public String toString(){
        return this.name;
    }*/
}
public class A4 {
   static List<Info> list=new ArrayList<>();
   static Map<Integer,Character> map=new Hashtable<>();
    public static void main(String[] args) {
        list.add(new Info("crpf"));
        list.add(new Info("ias"));
        list.add(new Info("police"));
        list.add(new Info("army"));
        list.add(new Info("airforce"));

        list.forEach(i->{
            if(i.getName().length()<4)
            System.out.println(i.getName());
        });
        System.out.println("*********************************");
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        map.put(4,'d');
        map.put(5,'e');

        map.forEach((i,c)-> System.out.println(i+"-->"+c));

        //using lambda expressions in enhanced forEach loop iteration

        System.out.println("****************************************");

        int x=10;
        new Thread(()-> System.out.println(x)).start();

        //variable used inside lambda expression should be final/effectively final
    }
}
