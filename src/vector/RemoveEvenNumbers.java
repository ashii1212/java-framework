package vector;

import java.util.Objects;
import java.util.Vector;
import java.util.Scanner;
//Store 10 integers in a Vector and remove all even numbers.
public class RemoveEvenNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> Numbers = new Vector<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the values if "+i+" :");
            int n = sc.nextInt();

            Numbers.add(n);;
        }
        System.out.println("++++++++++Approach 1 :+++++++++++++++");
        System.out.println("Even Number Removed  :"+EvenRemove(Numbers));
        System.out.println("++++++++++Approach 2 :+++++++++++++++");
        System.out.println("Even Number Removed  :"+EvenRemoves(Numbers));
    }
    // Approach 1 :
    public  static Vector<Integer> EvenRemove(Vector<Integer> Numbers)
    {
        Vector<Integer> v = new Vector<>();
        for(int i=0;i<Numbers.size();i++)
        {
              if(Numbers.get(i)%2!=0)
                  v.add(Numbers.get(i));
        }
        return v;
    }

    // Approach 2
    public static  Vector<Integer> EvenRemoves(Vector<Integer> Numbers)
    {
        for(int i=0;i<Numbers.size();i++) // i=0
        {
            if(Numbers.get(i)%2==0){
                Numbers.remove(i);
                i--;
            }
        }
        return Numbers;
    }


}
