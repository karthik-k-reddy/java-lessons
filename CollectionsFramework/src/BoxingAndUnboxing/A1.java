package BoxingAndUnboxing;

import java.util.ArrayList;

class ImplicitBoxAndUnbox{
    int intValue;
    ImplicitBoxAndUnbox(int intValue) {
        this.intValue=intValue;
    }
}
public class A1 {
    //static ArrayList<Integer> numbers=new ArrayList<>();//collections can only store objects,not primitive data
   // ImplicitBoxAndUnbox implicitBoxAndUnbox=new ImplicitBoxAndUnbox(10);
    static ArrayList<ImplicitBoxAndUnbox> numbers=new ArrayList<>();

    public static void main(String[] args) {

       /* //numbers.add(10);
        numbers.add(Integer.valueOf(10));//This happens while AutoBoxing(converting primitive type into non-primitive)
       // System.out.println(numbers.get(0));
        System.out.println(numbers.get(0).intValue());//This happens while AutoUnboxing(converting non-primitive type back into primitive )
        */
        numbers.add(new ImplicitBoxAndUnbox(10));//Implicit Boxing using parameterized constructor

        System.out.println( numbers.get(0).intValue);//Implicit Unboxing using intValue method

        System.out.println(Float.parseFloat("1.0"));//parse method converts string into respective wrapperClass objects

        System.out.println(Integer.parseInt("1000",2));//(String,radix) binary to decimal
        System.out.println(Integer.parseInt("1000",8));//octal to decimal
        System.out.println(Integer.parseInt("1000",16));//hexadecimal to decimal

    }
}
