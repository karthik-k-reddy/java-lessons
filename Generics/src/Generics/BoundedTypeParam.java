package Generics;

class GenBoundedTypeParam<K extends Character,V extends BoundedTypeParam>{

    private K Key;
    private V Value;

    public GenBoundedTypeParam(K key, V value) {
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
        return "Key=" + Key + ", Value=" + Value;
    }
    <K extends Float,N extends Number> void printEleAndNum(K element,N number){
        System.out.println(element+" "+number);
    }
}
public class BoundedTypeParam {
    public static void main(String[] args) {

    GenBoundedTypeParam genBoundedTypeParam=new GenBoundedTypeParam('a',new BoundedTypeParam());
    genBoundedTypeParam.getValue().test();
    System.out.println( genBoundedTypeParam.getKey());

    genBoundedTypeParam.printEleAndNum(1f,1);
    }

    void test(){
        System.out.println("Testing...");
    }
}
