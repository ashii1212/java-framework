package arraylist;

import java.util.ArrayList;

public class RemoveDuplicates
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

        System.out.println("Duplicates Removed :"+Duplicates(data));
    }
    public static ArrayList<Integer> Duplicates (ArrayList<Integer> data)
    {
        for(int i=0;i<=data.size()-1;i++){
            for(int j=i+1; j< data.size();j++){

                if(data.get(i).equals(data.get(j))){
                     data.remove(j);
                     j--;
                }
            }
        }
        return  data;
    }

}
