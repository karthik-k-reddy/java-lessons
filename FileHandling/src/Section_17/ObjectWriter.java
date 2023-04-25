package Section_17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectWriter {
    public static void main(String[] args) {
        Cars porsche = new Cars("porsche", 12000);
        Cars ferrari = new Cars("ferrari", 15000);
        Cars mustang = new Cars("mustang", 25000);

        try (FileOutputStream fos = new FileOutputStream("cars.txt")) {
            try(ObjectOutputStream os=new ObjectOutputStream(fos)){
               os.writeObject(porsche);
               os.writeObject(mustang);
               os.writeObject(ferrari);
                System.out.println("Writing objects onto file successful");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
