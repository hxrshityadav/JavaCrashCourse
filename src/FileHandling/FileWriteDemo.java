package FileHandling;
import java.io.*;


public class FileWriteDemo {

    public static void main(String[] args){

        try{
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Harshit Yadav");
            writer.close();

            System.out.println("File Written Successfully!");
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
