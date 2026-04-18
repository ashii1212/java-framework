package vector;

import java.util.Vector;

public class ReplaceElement
{
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(1);
        nums.add(2);
        nums.add(67);
        nums.add(34);
        nums.add(23);
        nums.add(8);
        System.out.println("Initial Vector :"+nums);
        nums.set(0,1);
        nums.set(1,2);
        nums.set(2,3);
        nums.set(3,4);
        nums.set(4,5);
        nums.set(5,6);
        System.out.println("Manual Replace  Vector :"+nums);

        System.out.println("using for loop to Replace  Vector :"+replaceElement(nums));
    }

    public static  Vector<Integer> replaceElement(Vector<Integer> nums)
    {
        for(int i=0;i<=nums.size()-1;i++){
            nums.set(i,i+1);
        }

        return nums;
    }

}
