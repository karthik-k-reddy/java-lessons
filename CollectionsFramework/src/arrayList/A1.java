package arrayList;

import java.util.ArrayList;

public class A1 {

    static ArrayList<String> names=new ArrayList<>();
    static ArrayList<String> movies=new ArrayList<>();
    static ArrayList<Integer> ratings=new ArrayList<>();
    public static void main(String[] args) {

      //  System.out.println(names.get(0));//IndexOutOfBoundsException
        names.add("rrr");
        movies.add("rrr");

        names.add("baahubali");
        movies.add("baahubali");

        names.add("kgf");
        movies.add("kgf") ;

        //names.add(1,"baahubali2");//adds the new element into specified position and moves the current index element back by one step

        names.add(0,"RRR");
        movies.add(1,"RRR");

        /*System.out.println(names);//prints all elements of the arrayList
        System.out.println(movies);
        System.out.println(names.equals(movies)); //compares two arrayLists for equality-->returns false even if elements are not in order
        System.out.println(ratings);
        System.out.println(names.get(0)); //get Element by position
        */
        A1 a=new A1();
        a.addElementAtPosition(0,"elephantWhispers");
        a.modifyElementAtPosition(1,"kgf2");
        a.removeElementByPosition(4);
        names.add(4,"kgf");
        a.removeElementByString("kgf");
        a.searchElementByString("kgf1");
        a.searchElementByIndex(1);
        movies.addAll(names); //adding two arrayLists
        System.out.println(movies);
        System.out.println(names);
        names.addAll(1,names);// adding two arrayLists at required position
        System.out.println(names);
        //names.clear();  //clear  all elements from arrayList
       ArrayList<String> clonedNames= (ArrayList<String>) names.clone(); //shallow copy of arrayList object
        System.out.println(clonedNames);
        clonedNames.clear();
        System.out.println(clonedNames.isEmpty());
    }

    void addElementAtPosition(int pos,String name){
        System.out.println("*******************************");
        System.out.println("o/p for:addElementAtPosition");
        System.out.println(names);
        names.add(pos, name);
        System.out.println(names);
    }
    void modifyElementAtPosition(int pos,String name){

        System.out.println("*******************************");
        System.out.println("o/p for:modifyElementAtPosition");
        System.out.println(names);
        names.set(pos, name);
        System.out.println(names);
    }
    void removeElementByPosition(int pos){
        System.out.println("*******************************");
        System.out.println("o/p for:removeElementByPosition");
        System.out.println(names);
        names.remove(pos);
        System.out.println(names);
    }
    void removeElementByString(String name){
        System.out.println("*******************************");
        System.out.println("o/p for:removeElementByString");
        System.out.println(names);
        if(names.indexOf(name)!=-1) {
            names.remove(name);
            System.out.println(names);
        }
        else System.out.println("Invalid entry");

    }

    void searchElementByString(String name){
        System.out.println("*******************************");
        System.out.println("o/p for:searchElementByString");
        if(names.indexOf(name)!=-1)
            System.out.println(name+" is present in the list");
        else System.out.println(name+" is not present in the list");
    }

    void searchElementByIndex(int pos) {
        try {
            System.out.println("element @ position"+pos+" is "+names.get(pos));
        }
        catch ( Exception e){
            System.out.println("element not found @ position"+pos);
        }
    }
}
