package Intermediate;

public class WrapperDemo {

    public static void main(String[] args){

        //Wrapper Objects
        Integer age = 21;
        Double cgpa = 6.8;
        Character grade = 'A';
        boolean placed = false;

        System.out.println("Age = " + age);
        System.out.println("CGPA = " + cgpa);
        System.out.println("Grade = " + grade);
        System.out.println("Placed = " + placed);

        System.out.println();

        //String -> int
        String number = "5000";
        int num = Integer.parseInt(number);

        System.out.println("String to int = " + num);

        //String -> double
        String price = "99.99";
        double p = Double.parseDouble(price);

        System.out.println("String to double = " + p);

        System.out.println();

        //int -> String
        int salary = 1000;
        String salaryText = Integer.toString(salary);

        System.out.println("int to String = " + salaryText);

        System.out.println();

        //Autoboxing
        int marks = 95;
        Integer wrappedMarks = marks;

        System.out.println("Autoboxing = " + wrappedMarks);

        //Unboxing
        Integer score = 85;
        int unboxedScore = score;

        System.out.println("Unboxing = " + unboxedScore);
    }
}
