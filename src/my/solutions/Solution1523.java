package my.solutions;

public class Solution1523 {
    public int countOdds(int low, int high) {
        int total = (high - low + 1);
        if (!isOdd(total)) return total / 2;
        else if (isOdd(low) || isOdd(high)) {
            return total / 2 + 1;
        } else return total / 2;

    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
