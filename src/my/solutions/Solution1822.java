package my.solutions;

import java.util.stream.IntStream;

public class Solution1822 {
    public int arraySign(int[] nums) {
        int product = IntStream.of(nums)
                .map(value -> {
                    if (value == 0) return 0;
                    return value > 0 ? 1 : -1;
                })
                .reduce(1, (left, right) -> left * right);
        return signFunc(product);
    }

    private int signFunc(int x) {
        if (x == 0) return x;
        return x > 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{
                41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 0, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41
        };
        System.out.println(new Solution1822().arraySign(temp));
    }
}
