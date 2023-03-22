package iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

    static List<String> names=new LinkedList<>();
    public static void main(String[] args) {
        names.add("cars");
        names.add("travelling");
        names.add("foood");
        App app=new App();
        app.printList(names);
    }
    void printList(List<String> names){
        Iterator<String> iterator=names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
