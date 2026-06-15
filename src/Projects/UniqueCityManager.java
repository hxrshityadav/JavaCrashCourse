package Projects;

import java.util.*;

public class UniqueCityManager {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Unique City Manager =====");
            System.out.println("1. Add City");
            System.out.println("2. Display Cities");
            System.out.println("3. Search City");
            System.out.println("4. Remove City");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter City Name: ");
                    String city = sc.nextLine();

                    if (cities.add(city)) {
                        System.out.println("City Added!");
                    } else {
                        System.out.println("City Already Exists!");
                    }

                    break;

                case 2:

                    if (cities.isEmpty()) {
                        System.out.println("No Cities Found!");
                    } else {

                        System.out.println("\nCities:");

                        for (String cityName : cities) {
                            System.out.println(cityName);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter City Name to Search: ");
                    String searchCity = sc.nextLine();

                    if (cities.contains(searchCity)) {
                        System.out.println("City Found!");
                    } else {
                        System.out.println("City Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter City Name to Remove: ");
                    String removeCity = sc.nextLine();

                    if (cities.remove(removeCity)) {
                        System.out.println("City Removed!");
                    } else {
                        System.out.println("City Not Found!");
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