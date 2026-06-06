package Projects;

import java.util.*;


public class StudentManagementSystem {

    static double calculateAverage(int[] marks){

        int sum = 0;

        for(int mark: marks){
            sum+= mark;
        }
        return (double) sum / marks.length;

    }

    static int findHighest(int[] marks){

        int highest = marks[0];

        for(int mark : marks){
            if(mark > highest){
                highest = mark;
            }
        }

        return highest;

    }

    static int findLowest(int[] marks){

        int lowest = marks[0];

        for(int mark : marks){
            if(mark < lowest){
                lowest = mark;
            }
        }

        return lowest;

    }

    static boolean searchMark(int[] marks, int target){

        for(int mark : marks){

            if(mark == target){
                return true;
            }
        }
        return false;
    }

    static String getGrade(double average){

        if(average >= 90){
            return "A";
        } else if(average >= 80){
            return "B";
        } else if(average >= 70){
            return "C";
        } else if(average >= 60){
            return "D";
        } else if(average >= 40){
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        while(true){

            System.out.println("======== Student Management System ========");
            System.out.println("1. Add Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Calculate Average");
            System.out.println("4. Find Highest Mark");
            System.out.println("5. Find Lowest Mark");
            System.out.println("6. Enter Marks to Search");
            System.out.println("7. Sort Marks");
            System.out.println("8. Show Grade");
            System.out.println("9. Exit");

            System.out.println("\n");

            System.out.println("Enter Choices: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:

                    for(int i = 0; i < marks.length; i++){

                        System.out.println("Enter Mark " + (i+1) + ": ");
                        marks[i] = sc.nextInt();

                    }
                    break;

                case 2:
                    for(int mark: marks){
                        System.out.println(Arrays.toString(marks));
                    }
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 3:
                    double average = calculateAverage(marks);
                    System.out.println("Average = " + average);
                    break;

                case 4:
                    int highest = findHighest(marks);
                    System.out.println("Highest Mark = " + highest);
                    break;

                case 5:
                    int lowest = findLowest(marks);
                    System.out.println("Lowest Mark = " + lowest);
                    break;

                case 6:
                    System.out.println("Enter Mark to Seach: ");
                    int target = sc.nextInt();

                    if(searchMark(marks, target)){
                        System.out.println("mark Found");
                    } else {
                        System.out.println("Mark not found");
                    }
                    break;

                case 7:
                    Arrays.sort(marks);

                    System.out.println("Sorted Marks: ");
                    System.out.println(Arrays.toString(marks));

                    break;

                case 8:

                    double avg = calculateAverage(marks);
                    String grade = getGrade(avg);

                    System.out.println("Average = " + avg);
                    System.out.println("Grade = " + grade);

                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }

    }

}
