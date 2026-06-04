public class TernaryOperator {
    public static void main(String[] args){
        int age = 20;

        /*String result; //Normal Method

        if(age >= 18){
            result = "Adult";
        } else {
            result = "Minor";
        }*/

        String result = age >= 18 ? "Adult":"Minor";
        System.out.println("Adult or Minor:" +result);

        int num = 10;
        String result1 = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Even or Odd:" + result1);
    }
}
