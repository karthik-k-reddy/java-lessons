package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

interface App{
       String printNameById(int x,String str);
}
public class A3 {
  static Map<Integer,String> map=new TreeMap<>();
    public static void main(String[] args) {
      map.put(1,"karthik");
      map.put(2,"koushik");
      map.put(3,"radha");
      map.put(4,"krishna");

        App app=(int x,String s)-> {
           if(x==1 || x==4)
               return map.get(4);
           else if(x==2 || x==3)
               return map.get(3);
           else
               return "OutOfIndex";
        };
        System.out.println(app.printNameById(5,"abcd"));
    }
}
