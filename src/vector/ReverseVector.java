package vector;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ReverseVector {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> data = new Vector<>();
        for(int i=1;i< 10;i++)
        {
            System.out.println("Enter a values of "+i+" :");
            int n = sc.nextInt();
            data.add(n);
        }
        System.out.println("=================Approach 1 without using Collections==========================");
        System.out.println("Reverse :"+reverse(data));
        System.out.println("==================Approach 2 without using Collections=========================");
        System.out.println("Reverse :"+reverseNum(data));
    }
// Approach 1 without using Collections
    public static  Vector<Integer> reverse(Vector<Integer> data)
    {
        Vector<Integer> rev = new Vector<>();

         for(int i=data.size()-1; i>=0;i--)
         {
             rev.add(data.get(i));
         }

         return  rev;
    }
// Approach 2 with  using Collections
    public static  Vector<Integer> reverseNum(Vector<Integer> data)
    {
        Collections.reverse(data);
        return data;
    }
}
