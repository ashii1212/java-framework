package vector;

import java.util.Vector;

public class removeDuplicates {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(1);
        nums.add(2);
        nums.add(67);
        nums.add(34);
        nums.add(1);
        nums.add(2);
        nums.add(23);
        nums.add(8);
        nums.add(1);
        nums.add(2);
        System.out.println("Before Removing Elements :" + nums);
        System.out.println("+++++++++++++++Return type++++++++++++++++++");
        System.out.println("After Removing Elements :" + removedeplicaties(nums));
        System.out.println("+++++++++++++++Non Return type++++++++++++++++++");
        Removedeplicaties(nums);
        System.out.println("After :"+nums);
    }

    // return type
    public static Vector<Integer> removedeplicaties(Vector<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    nums.remove(j);
                    j--;
                }
            }
        }
        return nums;
    }
   // non-return type
   public static void Removedeplicaties(Vector<Integer> nums) {
       for (int i = 0; i < nums.size(); i++) {
           for (int j = i + 1; j < nums.size(); j++) {
               if (nums.get(i).equals(nums.get(j))) {
                   nums.remove(j);
                   j--;
               }
           }
       }
   }

}
