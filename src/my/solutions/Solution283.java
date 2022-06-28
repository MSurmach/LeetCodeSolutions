package my.solutions;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for (int position = 0; position < nums.length; position++) {
            if (nums[position] != 0) {
                nums[pointer] = nums[position];
                pointer++;
            }
        }
        while (pointer < nums.length) {
            nums[pointer] = 0;
            pointer++;
        }
    }
}
