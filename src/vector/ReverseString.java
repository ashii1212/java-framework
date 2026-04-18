package vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String>details = new Vector<>();
        for(int i=1;i<=4;i++)
        {
            System.out.println("Enter  a data :");
            String data = sc.next();
            details.add(data);
        }
        System.out.println("=================Approach 1 with using Collections==========================");
        System.out.println("Reverse :"+reverse(details));
        System.out.println("=================Approach 2 without using Collections==========================");
        Reverse(details);
    }

   // Using Collections
    public static Vector<String> reverse(Vector<String> details)
    {
        Collections.reverse(details);

        return details;
    }
   // manual
    public static void Reverse(Vector<String> details){
        Vector<String>  data = new Vector<>();
        for(int i=details.size()-1; i>=0;i--)
        {
            data.add(details.get(i));
        }
        System.out.println("Reverse :"+data);
    }

}
