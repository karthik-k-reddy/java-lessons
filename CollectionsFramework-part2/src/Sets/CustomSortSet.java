package Sets;

import java.util.*;

class Data<K,V>{
    private K Key;
    private V Value;

    public Data(K key, V value) {
        this.Key = key;
        this.Value = value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return Value;
    }
   @Override
    public String toString(){
        return "key= "+this.Key+" value= "+this.Value;
    }

}
public class CustomSortSet {
    public static void main(String[] args) {

    /*    Comparator<Data<Integer,String>> KEY_COMPARE=new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer,String> obj2) {
                if(obj1.getKey() > obj2.getKey())
                    return -1;
                else if(obj1.getKey() < obj2.getKey())
                    return 1;
                else
                    return 0;
            }
        };*/
        Comparator<Data<Integer,String>> VALUE_LENGTH_COMPARE=new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> obj1, Data<Integer,String> obj2) {
                if(obj1.getValue().length() > obj2.getValue().length())
                    return -1;
                else if(obj1.getValue().length() < obj2.getValue().length())
                    return 1;
                else
                    return 0;
            }
        };

        Set<Data<Integer,String>> set=new TreeSet<>(VALUE_LENGTH_COMPARE);
       // set.add(new Data("1","one"));
        set.add(new Data(2,"two"));
        set.add(new Data(13,"thirteen"));
        set.add(new Data(4,"four"));
        set.add(new Data(8,"Eight"));
        set.add(new Data(11,"eleven"));


        for(Data<Integer,String> ele:set){
            System.out.println(ele);
        }
    }

}
