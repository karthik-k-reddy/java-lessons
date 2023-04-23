package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
    private String msg;
    public Data(String msg){
        this.msg=msg;
    }
    public String getMsg(){
        return this.msg;
    }
}
public class A2 {
    public static void main(String[] args) {
        List<Data> list=new ArrayList<>();
        list.add(new Data("omuni"));
        list.add(new Data("bisleri"));
        list.add(new Data("globe"));
        list.add(new Data("ups"));
        list.add(new Data("lambda"));

        /*Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data d1, Data d2) {
                return d1.getMsg().compareTo(d2.getMsg());
            }
        });*/
        //natural ordering using comparator interface

       // Collections.sort(list,(Data d1,Data d2)->d1.getMsg().compareTo(d2.getMsg()));
        //natural ordering using comparator interface and lambda expression
        //Comparator interface is a functional interface even though it has 2 abstract classes(compare and equals)
        //bcz equals comes from Object class(Super class)

        Collections.sort(list,(Data d1, Data d2)->{
            if(d1.getMsg().length() > d2.getMsg().length())
                return -1;
            else if (d1.getMsg().length() < d2.getMsg().length())
                return 1;
            else
                return 0;
        });
        //lengthwise ordering using Comparator interface and lambda expression for multiline statements

        for(Data data:list){
            System.out.println(data.getMsg());
        }
    }
}
