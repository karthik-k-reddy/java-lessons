package DSPart2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapz {

    public static void main(String[] args) {

        Map<Integer,String> bikes=new HashMap<>(10);//map of size=10

        Map<Integer,String> cars=new HashMap<>();
        cars.put(1,"audi");
        cars.put(2,"jaguar");
        cars.put(3,"ferrari");
        cars.put(4,"tata");
        for (Map.Entry<Integer,String> entry:cars.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
        System.out.println("**************************");
        System.out.println(cars.get(1));//returns value if present else returns null
        System.out.println("**************************");
        Iterator<Map.Entry<Integer,String>> entry=cars.entrySet().iterator();
        while (entry.hasNext()){
            System.out.println(entry.next());
        }
        System.out.println("***************************");
        Iterator<Map.Entry<Integer,String>> entry1=cars.entrySet().iterator();
        while (entry1.hasNext()){
            System.out.println(entry1.next().getKey() +" "+entry1.next().getValue());
        }
        System.out.println("******************************");
        Iterator<Map.Entry<Integer,String>> entry2=cars.entrySet().iterator();
        while (entry2.hasNext()){
            Map.Entry<Integer,String> temp=entry2.next();
            System.out.println(temp.getKey() +" "+temp.getValue());
        }
    }
}
