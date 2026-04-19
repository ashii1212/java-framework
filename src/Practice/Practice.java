package Practice;

import java.util.Stack;

public class Practice
{
    public static void main(String[] args) {
        String str = "{[()}}";

        if(isBalance(str)){
            System.out.println("Balanced");
        }else{
            System.out.println("not Balanced");
        }
    }

   public static boolean isBalance(String str)
   {
       Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(ch == '{' || ch =='[' || ch == '(')
            {
               stack.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')')
            {
                if(stack.isEmpty()){
                    return  false;
                }

                char top = stack.pop();

                if((ch==')' && top !='(') ||(ch==']' && top !='[')||(ch=='}' && top !='{') )
                {
                    return  false;
                }
            }
        }
        return stack.isEmpty();
   }


}
