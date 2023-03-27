import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        Set<Object> set=new HashSet<>();
        addEleToSet(set);
         printSet(set);
        System.out.println("****************************");

        Set<Object> set1=new LinkedHashSet<>();
        addEleToSet(set1);
        printSet(set1);
        System.out.println("****************************");

        Set<Object> set2=new TreeSet<>();
        addEleToSet(set2);
        printSet(set2);
        System.out.println("****************************");
}

static void addEleToSet(Set<Object> s){
    for(int i=0;i<21;i++){
        s.add("A"+i);
    }
}
static void printSet(Set<?> s){
        for(Object o:s){
            System.out.println(o);
        }
}
}