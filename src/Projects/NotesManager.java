package Projects;
import java.io.*;
import java.util.*;

public class NotesManager {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n===== Notes Manager =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    try{
                        FileWriter writer = new FileWriter("notes.txt", true);

                        System.out.print("Enter Note: ");
                        String note = sc.nextLine();

                        writer.write(note + "\n");
                        writer.close();

                        System.out.println("Note Saved!");

                    } catch(IOException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:

                    try {

                        BufferedReader reader =
                                new BufferedReader(
                                        new FileReader("notes.txt")
                                );

                        String line;

                        System.out.println("\n===== Notes =====");

                        while((line = reader.readLine()) != null){

                            System.out.println(line);

                        }

                        reader.close();

                    } catch(IOException e){

                        System.out.println(
                                "Error: " + e.getMessage()
                        );
                    }

                    break;

                case 3:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }

            }

    }
}
