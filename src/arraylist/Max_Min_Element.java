package arraylist;

import java.util.ArrayList;

public class Max_Min_Element {
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

        System.out.println("Max :"+max(data));
        System.out.println("--------");
        System.out.println("Min :"+min(data));
    }

    public static int max(ArrayList<Integer> data)
    {
        int max = data.get(0); // u can use Integer.MIN_VALUE
        for(Integer d : data){
            if(d > max){
                max = d;
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> data){
        int min = data.get(0);
        for(int i=0;i<data.size();i++){
            if(data.get(i)<min){
                min = data.get(i);
            }
        }
        return min;
    }


}
