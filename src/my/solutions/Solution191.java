package my.solutions;

public class Solution191 {
    public int hammingWeight(int n) {
        String input = Integer.toBinaryString(n);
        return (int) input.chars().filter(value -> value == '1').count();
    }

    public static void main(String[] args) {
        System.out.println(new Solution191().hammingWeight(521));
    }
}
