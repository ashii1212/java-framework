package vector;

import java.util.Vector;

public class MaximumElement
{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(8);
        v.add(67);
        v.add(5);
        v.add(56);

        int max = Max(v);
        System.out.println("MAX :"+max);
    }

    public static  int Max(Vector<Integer> v)
    {

        int max = Integer.MIN_VALUE;
        for(Integer value :v){
            if (value > max){
                max = value;
            }
        }
        return max;
    }

}
