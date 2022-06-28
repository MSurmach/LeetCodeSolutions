package my.solutions;

import java.util.Arrays;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).map(ints -> Arrays.stream(ints).sum()).max(Integer::compare).get();
    }

    public static void main(String[] args) {
        new Solution1672().maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}});
    }
}
