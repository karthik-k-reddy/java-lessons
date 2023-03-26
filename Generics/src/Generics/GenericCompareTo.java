package Generics;

class Data<T extends Comparable<T>> implements Comparable<T>{

    private T myVar;

    public Data(T myVar) {
        this.myVar = myVar;
    }

    public T getMyVar() {
        return myVar;
    }

    @Override
    public int compareTo(T t) {
        return getMyVar().compareTo(t);
    }
}
public class GenericCompareTo {

    public static void main(String[] args) {
        Data<Integer> data=new Data<Integer>(1);
        System.out.println( data.compareTo(1));
        System.out.println( data.compareTo(0));
        System.out.println( data.compareTo(2));
    }

}
