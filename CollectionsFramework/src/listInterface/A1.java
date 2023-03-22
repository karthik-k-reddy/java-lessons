package listInterface;

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        List<String> phones=new ArrayList<>();
        phones.add("Iphone");
        phones.add("vivoz");
        phones.add("mi");
        phones.add("nokia");
        phones.add("a");
        phones.add("A");
        phones.add("z");
        phones.add("Z");

        List<String> cars=new LinkedList<>();
        cars.add("jaguar");
        cars.add("ferrari");
        cars.add("lamborghini");
        cars.add("bmw");
        cars.add("audi");

        cars.addAll(phones);
        System.out.println("adding phones to cars list ");
        System.out.println(cars);//+phones
        System.out.println(phones+"\n\n");//unaltered

        new A1().displayElements(cars);

        Iterator<String> iterator=phones.listIterator();

        /*while(iterator.hasNext()){
            System.out.println("reverse iteration:"+iterator.previous()); //NoSuchElementException
        }*/

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*******************");
        Collections.sort(phones);//sorting based on alphabets
        System.out.println(phones);
        Collections.reverse(phones);//reverse of the list
        System.out.println(phones);
        cars.sort(null); //sorting based on alphabets
        System.out.println(cars);
        }
        void displayElements(List<String> ele){
        for (String s:ele){
            System.out.println(s);
        }
            System.out.println("******************************************");
        }
    }

