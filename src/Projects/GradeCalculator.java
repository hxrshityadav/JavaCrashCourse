package Projects;

import java.util.Scanner;

public class GradeCalculator {

    static boolean isValidMark(double mark){
        return mark >= 0 && mark <= 100;
    }

    static boolean validateMark(double mark, String subject){

        if(!isValidMark(mark)){
            System.out.println("Invalid " + subject + " Marks");
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the Student: ");
        String name = sc.nextLine();

        System.out.println("Enter marks of Maths: ");
        double maths = sc.nextDouble();

        if(!validateMark(maths, "Maths")){
            sc.close();
            return;
        }

        System.out.println("Enter Marks of Science: ");
        double science = sc.nextDouble();

        if(!validateMark(science, "Science")){
            sc.close();
            return;
        }

        System.out.println("Enter Marks of Social Science: ");
        double socialScience = sc.nextDouble();

        if(!validateMark(socialScience, "Social Science")){
            sc.close();
            return;
        }

        System.out.println("Enter Marks of Computer: ");
        double computer = sc.nextDouble();

        if(!validateMark(computer, "Computer")){
            sc.close();
            return;
        }

        System.out.println("Enter Marks of English: ");
        double english = sc.nextDouble();

        if(!validateMark(english, "English")){
            sc.close();
            return;
        }

        double totalMarks = maths + science + socialScience + computer + english;
        double percentage = (totalMarks / 500.0) * 100;
        double percentageRounded = Math.round(percentage * 10.0) /10.0;
        String grade;
        String result;

        if(percentage >= 90){
            grade = "A";
        } else if(percentage >= 80){
            grade = "B";
        } else if(percentage >= 70){
            grade = "C";
        } else if(percentage >= 60){
            grade = "D";
        } else if(percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        if(percentage >= 40){
            result = "Pass";
        } else{
            result = "Fail";
        }

        double highest = maths;
        double lowest = maths;

        if(science > highest){
            highest = science;
        }
        if(socialScience > highest){
            highest = socialScience;
        }
        if(computer > highest){
            highest = computer;
        }
        if(english > highest){
            highest = english;
        }

        if(science < lowest){
            lowest = science;
        }
        if(socialScience < lowest){
            lowest = socialScience;
        }
        if(computer < lowest){
            lowest = computer;
        }
        if(english < lowest){
            lowest = english;
        }


        System.out.println("\n===== Report Card =====");
        System.out.println("Student Name      : " + name);
        System.out.println("Total Marks       : " + totalMarks);
        System.out.println("Percentage        : " + percentageRounded + "%");
        System.out.println("Highest Marks     : " + highest);
        System.out.println("Lowest Marks      : " + lowest);
        System.out.println("Result            : " + result);
        System.out.println("Grade             : " + grade);

        sc.close();
    }
}
