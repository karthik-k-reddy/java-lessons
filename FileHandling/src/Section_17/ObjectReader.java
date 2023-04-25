package Section_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("cars.txt")){
            try(ObjectInputStream is=new ObjectInputStream(fis)){
               Cars c1=(Cars) is.readObject();  //downCasting from Object type to Cars type
               Cars c2=(Cars) is.readObject();
               Cars c3=(Cars) is.readObject();
             //   Cars c4=(Cars) is.readObject();  //this line generates EOF Exception
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
               // System.out.println(c4);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
