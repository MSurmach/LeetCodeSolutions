package my.solutions;

import java.util.Arrays;

public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int position = 2; position < arr.length; position++) {
            if (arr[position] - arr[position - 1] != difference) return false;
        }
        return true;
    }
}
