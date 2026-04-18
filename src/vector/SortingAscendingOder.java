package vector;

import java.util.Collections;
import java.util.Vector;

public class SortingAscendingOder {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(87);
        numbers.add(32);
        numbers.add(1);
        System.out.println("Sorting Ascending Oder :"+ascendingOrder(numbers));
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Sorting descending Oder :"+descendingOrder(numbers));
    }
  public static Vector<Integer> ascendingOrder(Vector<Integer> numbers)
  {
        Collections.sort(numbers);
          return  numbers;
  }

  public static Vector<Integer> descendingOrder(Vector<Integer> numbers)
  {
        Collections.sort(numbers,Collections.reverseOrder());
        return  numbers;
  }
}
