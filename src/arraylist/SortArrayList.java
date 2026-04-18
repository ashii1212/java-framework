package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList
{
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
        System.out.println("Using Collections Ascending Order :");
        System.out.println(Ascending(data));
        System.out.println("Using Collections descending Order :");
        System.out.println(descending(data));

    }
   public  static ArrayList<Integer> Ascending(ArrayList<Integer> data)
   {
        Collections.sort(data);
        return data;
   }
    public  static ArrayList<Integer> descending(ArrayList<Integer> data)
    {
        Collections.sort(data,Collections.reverseOrder());
        return data;
    }


}
