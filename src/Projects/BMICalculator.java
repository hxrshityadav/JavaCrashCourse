package Projects;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your weight(kg): ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height(m): ");
        double height = sc.nextDouble();

        double bmi = weight/(height*height);

        double bmiRounded = Math.round(bmi * 10.0)/10.0;

        String category;
        if(bmi < 18.5){
            category = "Underweight";
        } else if (bmi < 25.0){
            category = "Normal";
        } else if(bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("\n===== BMi Report =====");
        System.out.println("Name      :" + name);
        System.out.println("BMI       :" + bmiRounded);
        System.out.println("Category  :" + category);

        sc.close();
    }
}
