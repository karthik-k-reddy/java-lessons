package Section_17;

import java.io.File;
import java.io.IOException;

public class A1 {
    public static void main(String[] args) throws IOException {

        File directory=new File("/home/Karthik.K/Sweets/anand/indian/southindian"); //names of directories
        directory.mkdirs(); //creating multiple directories one inside the other
        System.out.println("Directory created");
        File file=new File("Sweets/anand/indian/southindian/mysorepak.txt"); //path of file
        file.createNewFile();  //creating new file in the specified path
        System.out.println("File created");
    }
}
