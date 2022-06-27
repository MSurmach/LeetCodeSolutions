package my.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution202 {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int product = productSquares(separateByDigits(n));
        while (product != 1) {
            if (set.add(product)) {
                product = productSquares(separateByDigits(product));
            } else return false;
        }
        return true;
    }

    private static List<Integer> separateByDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            int rest = n % 10;
            digits.add(rest);
            n = (n - rest) / 10;
        }
        return digits;
    }

    private static int productSquares(List<Integer> digits) {
        return digits.stream().map(value -> value * value).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(new Solution202().isHappy(2));
    }
}
