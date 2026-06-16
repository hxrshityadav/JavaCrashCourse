package Intermediate;

public class StringBuilderDemo {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();

        sb.append("Harshit");
        sb.append(" ");
        sb.append("Yadav");

        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.charAt(0));

        sb.insert(0, "Mr. ");
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);

        sb.replace(0, 7, "Prince");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

    }
}
