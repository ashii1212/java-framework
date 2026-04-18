package arraylist;

import java.util.ArrayList;

public class RemoveEvenNumbers
{
    public static void main(String[] args)
    {
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

        System.out.println("Removed Even Elements :"+RemoveEvenNumber(data));
    }

    public static ArrayList<Integer> RemoveEvenNumber(ArrayList<Integer> data)
    {
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i)%2==0)
            {
                data.remove(i);
                i--;
            }
        }
        return  data;
    }

}
