package vector;

import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;
public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> values = new Vector<>();
        for(int i=0; i<=5;i++){
            System.out.println("Enter values of "+i+" :");
             int num = sc.nextInt();
             values.add(num);
        }
        int min = min(values);
        System.out.println("Min :"+min);
    }
    public static  int min(Vector<Integer> values)
    {
         int min  = values.get(0);
        for(int i=0;i< values.size();i++)
        {
           if (values.get(i)< min){
               min =values.get(i);
           }
        }
        return min;
    }



}
