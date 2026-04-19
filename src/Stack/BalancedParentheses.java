package Stack;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        String input = "{[()]}";

        if (isBalanced(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (!isMatching(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}