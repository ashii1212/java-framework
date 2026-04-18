package arraylist;

import java.util.ArrayList;

public class ReverseArrayList
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

        System.out.println("Reverse a ArrayList :"+reverse(data));
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> data)
    {
        ArrayList<Integer> rev = new ArrayList<>();
        for(int i =data.size()-1; i>=0;i--){
              rev.add(data.get(i));
        }
        return rev;
    }

}
