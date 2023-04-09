package DSPart2;

import java.util.*;

class Phones implements Comparable<Phones>
{
    private String brand;

    public Phones(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public int compareTo(Phones phones) {
        return getBrand().compareTo(phones.brand);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
public class CustomSearch {
    public static void main(String[] args) {
        Set<Phones> set=new TreeSet<>();
        set.add(new Phones("iphone"));
        set.add(new Phones("samsung"));
        set.add(new Phones("oneplus"));
        set.add(new Phones("iphone"));
        set.add(new Phones("mi"));
        set.add(new Phones("nokia"));
        set.add(new Phones("iphone"));
        System.out.println(set);
        List<Phones> list=new LinkedList<>();
        list.addAll(set); //inserting all elements of set into list
        list.add(new Phones("oppo"));
        System.out.println(list);
       Collections.sort(list);//sorting based on comparable interface and overriding compareTo method
        System.out.println(list);
        System.out.println("****************************************");
       Iterator<Phones> iterator= list.listIterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }
        System.out.println(Collections.binarySearch(list,new Phones("oppo"))); //find index of given object in the list
        System.out.println(list.indexOf(new Phones("oppo")));
    }
}
