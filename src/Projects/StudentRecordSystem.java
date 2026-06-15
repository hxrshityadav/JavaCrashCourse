package Projects;

import java.util.*;

public class StudentRecordSystem {

    public static void main(String[] main){

        HashMap<Integer, String> students = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by Roll No");
            System.out.println("3. Display All Students");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.println("6. Total Students");


            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:

                    System.out.println("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    students.put(rollNo, name);

                    System.out.println("Student Added!");

                    break;

                case 2:

                    System.out.println("Enter Roll No to Search: ");
                    int searchRollNo = sc.nextInt();

                    if(students.containsKey(searchRollNo)){
                        System.out.println("Student Found: " + students.get(searchRollNo));
                    } else {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 3:

                    if(students.isEmpty()){

                        System.out.println("No Students Found!");

                    } else {

                        System.out.println("\nStudent Records:");

                        for(Integer studentRollNo : students.keySet()){

                            System.out.println(
                                    studentRollNo + " -> " +
                                            students.get(studentRollNo)
                            );
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll No to Remove: ");
                    int removeRollNo = sc.nextInt();

                    if(students.containsKey(removeRollNo)){

                        students.remove(removeRollNo);

                        System.out.println("Student Removed!");

                    } else {

                        System.out.println("Student Not Found!");

                    }

                    break;

                case 5:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 6:

                    System.out.println(
                            "Total Students: " +
                                    students.size()
                    );

                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
