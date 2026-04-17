package vector;

import java.util.Vector;

public class DisplayElements
{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(23);
        v.add(5);
        v.add(98);
        v.add(65);
        v.add(3);
        System.out.println("Elements Display Using object");
        System.out.println(v);
        System.out.println("Elements Display Using For loop");
        for (Integer value :v)
        {
            System.out.println(value);
        }

    }
}
