package comparableInterface;

import java.util.*;

class Names implements Comparable<Names>{

    String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

   /* @Override
    public int compareTo(Names names) {
        return 0;
    }*/


    @Override
    public int compareTo(Names name) {
       if(this.name.length()==name.name.length())
           return 0;
       else if (this.name.length()>name.name.length())
           return  1;
       else
           return -1;
    }


}
public class App {

    static List<Names> names=new LinkedList<>();
    public static void main(String[] args) {

        names.add(new Names("fortuner"));
        names.add(new Names("skoda-rapid"));
        names.add(new Names("mini-cooper"));
        names.add(new Names("endeavour"));
        names.add(new Names("BMWX7"));

        App app=new App();
        app.printList();
        Collections.sort(names);
        app.printList();
        }
        void printList(){
            Iterator<Names> iterator =names.listIterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());

        }
            System.out.println("*****************************");
    }


}
