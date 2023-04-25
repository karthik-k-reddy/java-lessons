package Section_17;

import java.io.*;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args)  {
        File file=new File("Music/Indian");
        file.mkdirs();
        System.out.println("Directory creation success");
        file=new File("Music/Indian/carnatic.txt");

        //FileWriter(file,true) appends the content
        //FileWriter(file,false) overwrites the content

        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,false))){
            bw.write("First");
            bw.newLine();
            bw.write("Second");
            bw.newLine();
            bw.write("Third");
            bw.newLine();
            bw.write("Fourth");
            bw.newLine();
            System.out.println("Writing onto file success");
            bw.close();
        } catch (IOException e) {
            System.out.println("error while writing onto file");
        }
        System.out.println("*******BufferedReaderClassReading****************");
        try (BufferedReader br=new BufferedReader(new FileReader("Music/Indian/carnatic.txt"))){
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("********ScannerClassReading****************");
        try(Scanner sc=new Scanner(new File("Music/Indian/carnatic.txt"))){
            while (sc.hasNext())
                System.out.println(sc.nextLine());
           // sc.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*******************FileDeletion**********************");
        file=new File("Dance/Indian");
        file.mkdirs();
        try {
            file=new File("Dance/Indian/kathak.txt");
            file.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       while (true){
        if(file.delete())
            System.out.println("File deleted");
        else {
            System.out.println("Error while deleting the file");
            break;
        }
    }
    }
}

