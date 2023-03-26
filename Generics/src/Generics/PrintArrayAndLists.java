package Generics;

import java.util.LinkedList;
import java.util.List;

class GenPrintArrayAndLists{
    <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
       <E> void printList(List<E> list) {
            for (E element : list) {
                System.out.println(element);
            }
        }
    }

        public class PrintArrayAndLists {


            public static void main(String[] args) {

                String[] strArr = {"one", "two", "three", "four"};
                Integer[] intArr = {1, 2, 3, 4};
                Double[] doubleArr = {1.2, 2.3, 3.4, 4.5};
                Character[] charArr = {'1', '2', '3', '4'};

                GenPrintArrayAndLists genprintArrayAndLists = new GenPrintArrayAndLists();

                genprintArrayAndLists.printArray(strArr);
                genprintArrayAndLists.printArray(intArr);
                genprintArrayAndLists.printArray(doubleArr);
                genprintArrayAndLists.printArray(charArr);

                List<String> list = new LinkedList<>();
                list.add("one");
                list.add("two");
                list.add("three");
                list.add("four");

                List<Integer> list1=new LinkedList<>();
                list1.add(1);
                list1.add(2);
                list1.add(3);
                list1.add(4);

                List<Character> list2=new LinkedList<>();
                list2.add('1');
                list2.add('a');
                list2.add('2');
                list2.add('b');

                List<Double> list3=new LinkedList<>();
                list3.add(1.2);
                list3.add(2.3d);
                list3.add(3d);
                list3.add(4.0);

                genprintArrayAndLists.printList(list);
                genprintArrayAndLists.printList(list1);
                genprintArrayAndLists.printList(list2);
                genprintArrayAndLists.printList(list3);

                }

            }



