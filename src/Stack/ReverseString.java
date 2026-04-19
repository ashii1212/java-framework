package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Abdul Ashiq";
        Stack<Character> ch = new Stack<>();
        for(Character c : name.toCharArray())
        {
            ch.push(c);
        }
        System.out.println("Using return type :");
        System.out.println("Popped :"+reverse(ch));
        System.out.println("Using non return type :");
        System.out.print("Popped :");
        Reverse(ch);
    }

    // non-return type
    public static void Reverse(Stack<Character> ch){
        while (!ch.isEmpty()){
            System.out.print(ch.pop());
        }
    }
    // return types
    public static  String reverse(Stack<Character> ch)
    {
        String name ="";
        while (!ch.isEmpty())
        {
            name += ch.pop();
        }
        return  name;
    }

}
