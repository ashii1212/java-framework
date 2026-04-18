package arraylist;

import java.util.ArrayList;

public class MergeArraylist
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
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        System.out.println("Merge :"+merge(data,num));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> data1 ,ArrayList<Integer> data2)
    {
         data1.addAll(data2);
         return data1;
    }


}
