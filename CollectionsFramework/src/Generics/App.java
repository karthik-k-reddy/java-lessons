package Generics;

 class MyGenericClass<T>{
     private T data;

     public MyGenericClass(T data) {
         this.data = data;
     }

     public T getData() {
         return data;
     }
 }
class Data{
     private Object obj;

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}
public class App {
    public static void main(String[] args) {

       /* Data data=new Data("String data");
        String str= (String) data.getObj();
        System.out.println(str);*/

        MyGenericClass<String> myGenericClass=new MyGenericClass<String>("Alpha");
       String string  =  myGenericClass.getData();
        System.out.println(string);

    }
}
