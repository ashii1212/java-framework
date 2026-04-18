package vector;

import java.util.Vector;

public class CountFrequency {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Count  Frequency Element :"+count(numbers,2));
    }

    public static int count(Vector<Integer> numbers,int target)
    {

        int count =0;
         for(Integer num : numbers){
             if(num.equals(target)){
                 count++;
             }
         }
         return count;
    }

}
