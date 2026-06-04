public class Strings {
    public static void main(String[] args){

        int age = 21;
        String g = "50";
        String pi = "3.14";
        String name = "Harshit";
        String s = "Java";
        String d = " Java ";
        String e = "Java Programming";
        String f = "Java,C++,Python,Go";
        String a = "JAVA";
        String b = "Java";
        String x = new String("Java");
        String y = new String("Java");



        System.out.println(name);
        System.out.println(s.length()); //Returns total number of characters
        System.out.println(s.toUpperCase()); // Converts to uppercase
        System.out.println(s.toLowerCase()); // Converts to lowercase
        System.out.println(d.trim()); // Removes leading and trailing spaces
        System.out.println(e.contains("Java")); // Checks if a word exists
        System.out.println(e.startsWith("Java")); // Checks starting characters
        System.out.println(e.endsWith("ing")); // Checks ending characters
        System.out.println(e.indexOf('v')); // Finds position of a character/word
        System.out.println(e.charAt(2)); // Gets character at a position
        System.out.println(e.substring(5)); // Extract from a position till end
        System.out.println(e.substring(0,4)); // Extract part of a string
        System.out.println(
                e.replace("Java","Python")
        ); // Replace text
        String[] arr = f.split(","); // Breaks string into pieces
        for(String lang : arr){
            System.out.println(lang);
        }
        System.out.println(a.equals(b)); // Correct way to compare Strings
        System.out.println(a.equalsIgnoreCase("java")); // Ignores upper/lower case

        System.out.println(x == y); //⭐ Interview Favorite (== -> compares addresses)
        System.out.println(x.equals(y)); // ⭐ Interview Favorite (equals() -> compares content)

        String v = String.valueOf(age); // Convert primitive → String
        System.out.println(v);

        int num = Integer.parseInt(g); // Convert String → int
        System.out.println(num + 10);

        double i = Double.parseDouble(pi); // Convert String → double
        System.out.println(i);
    }
}
