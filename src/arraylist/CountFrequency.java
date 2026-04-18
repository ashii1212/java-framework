package arraylist;

import java.util.ArrayList;

public class CountFrequency {
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

        System.out.println("Value Appears : "+FrequencyElement(data,2)+" Times");
    }

   public static int FrequencyElement(ArrayList<Integer> data, int value)
   {
        int count =0;
        for(Integer d : data)
        {
            if(d.equals(value)){
                count++;
            }
        }
        return  count;
   }

}
