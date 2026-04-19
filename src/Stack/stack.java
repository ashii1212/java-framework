package Stack;

import java.util.Stack;

public class stack
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.add(7);
        System.out.println("Stack: " + stack);

        // Peek
        System.out.println("Top element: " + stack.peek()); // return top values

        // Pop
        System.out.println("Removed: " + stack.pop()); // remove top value and return

        System.out.println("Stack after pop: " + stack);

        // Check empty
        System.out.println("Is empty: " + stack.isEmpty()); // check is empty or not
    }


}
