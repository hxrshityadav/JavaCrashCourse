package FileHandling;
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args){

        try{
            FileReader reader = new FileReader("Student.txt");

            int character;

            while((character = reader.read()) != -1){
                System.out.print((char) character);
            }
            reader.close();

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
