package my.solutions;

import java.util.Arrays;

public class Solution1491 {
    public double average(int[] salary) {
        int sum = Arrays.stream(salary).sum();
        int min = salary[0];
        int max = salary[0];
        for (int value :
                salary) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
