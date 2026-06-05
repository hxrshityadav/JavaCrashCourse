package ControlFlowAndMethods;

public class ForEach {
    public static void main(String[] args){
        String[] fruits = {"Apple", "Mango", "Banana"};

//        Normal For Loop
//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }


// for-each loop (or enhanced for loop)
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
