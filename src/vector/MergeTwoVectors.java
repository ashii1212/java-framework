package vector;

import java.util.Vector;

public class MergeTwoVectors {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        Vector<Integer> v3= new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v2.add(6);
        v2.add(7);
        v2.add(8);
        v2.add(9);
        // added v1 vector to vector v3
        v3.addAll(v1);
        // added v2 vector to vector v3
        v3.addAll(v2);

        System.out.println(v3);

    }
}
