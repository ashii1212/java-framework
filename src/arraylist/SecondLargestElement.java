package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(4);
        data.add(7);
        data.add(9);
        data.add(10);
        data.add(2);
        data.add(15);
        data.add(20);
        data.add(25);
        data.add(30);
        data.add(2);
        System.out.println("Second largest :"+SecondLargest(data));
        System.out.println("using Collections ");
        System.out.println("Second largest :"+secondlargest(data));
    }

    public static int SecondLargest(ArrayList<Integer> data){
       int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;
       for(Integer n : data){
           if(n >first){
               second = first;
               first = n;
           } else if (n >second && n !=first)
           {
               second = n;
           }
       }
       return second;
    }
    //using Collections
    public  static  int secondlargest(ArrayList<Integer> data)
    {
        Collections.sort(data);
         return  data.get(data.size()-2);
    }

}
