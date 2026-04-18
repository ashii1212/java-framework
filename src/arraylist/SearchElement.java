package arraylist;

import java.util.ArrayList;

public class SearchElement {
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

        System.out.println("Given values is present :"+contain(data,2));
        System.out.println("=============================");
        present(data,4);
    }
    // using for-loop
    public  static  boolean contain(ArrayList<Integer>data,int value)
    {
        for(int i=0;i<data.size();i++){
            if(data.get(i).equals(value))
            {
                return true;
            }
        }
        return  false;
    }

    // using in-build method

    public static void present(ArrayList<Integer> data,int value)
    {
        System.out.println("Given values is present :"+data.contains(value));
    }



}
