package my.solutions;

public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int rest = n % 10;
            sum += rest;
            product *= rest;
            n = (n - rest) / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int number = 525;
        System.out.println(new Solution1281().subtractProductAndSum(number));
    }
}
