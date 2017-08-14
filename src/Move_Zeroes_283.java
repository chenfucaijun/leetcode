import java.util.ArrayList;

public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> nonZero = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero.add(nums[i]);
            }
        }
        for (int i = 0; i < nonZero.size(); i++) {
            nums[i] = nonZero.get(i);
        }
        for (int i = nonZero.size(); i < nums.length; i++) {
            nums[i] = 0;
        }


    }

    public void moveZeroes2(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (; nonZeroIndex < nums.length; nonZeroIndex++) {
            nums[nonZeroIndex] = 0;
        }
    }

    public void moveZeroes3(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {


                    int t = nums[i];
                    nums[i] = nums[nonZeroIndex];
                    nums[nonZeroIndex++] = t;
                }
            }

        }

    }

}
