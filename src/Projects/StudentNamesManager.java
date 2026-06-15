package Projects;

import java.util.*;

public class StudentNamesManager {

    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n===== Student Names Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    students.add(name);

                    System.out.println("Student Added!");

                    break;

                case 2:

                    if(students.isEmpty()){
                        System.out.println("No Students Found!");
                    } else {

                        System.out.println("\nStudents:");

                        for(String student : students){
                            System.out.println(student);
                        }
                    }

                    break;

                case 3:

                    System.out.println("Enter Student Name to Search: ");
                    String searchName = sc.nextLine();

                    if(students.contains(searchName)){
                        System.out.println("Student Found!");
                    } else {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    System.out.println("Enter Student Name to Remove: ");

                    String removeName = sc.nextLine();

                    if(students.remove(removeName)){
                        System.out.println("Student Removed!");
                    } else {
                        System.out.println("Student Not Found!");
                    }

                    break;


                    case 5:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");


            }
        }

    }

}
