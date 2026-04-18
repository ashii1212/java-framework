package vector;

import java.util.Vector;

public class SearchElement {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        System.out.println("Search Element :"+v1.contains(2));
        System.out.println("Search for Element :"+searchElement(v1,2));
    }
  // using manual
    public static boolean searchElement(Vector<Integer> v1, int element) {
        for (int i = 0; i < v1.size(); i++) {
            if (v1.get(i).equals(element)) {
                 return true;
            }
        }

         return false;
    }

}