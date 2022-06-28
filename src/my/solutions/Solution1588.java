package my.solutions;

public class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int oddLength = 1;
        int maxOddLength = arr.length % 2 == 0 ? arr.length - 1 : arr.length;
        for (int position = 0; position < arr.length; position++) {
            for (int innerPosition = position, counter = oddLength; counter > 0; innerPosition++, counter--) {
                sum += arr[innerPosition];
            }
            if (position == arr.length - 1 || position == arr.length - oddLength) {
                position = -1;
                if (oddLength < maxOddLength) oddLength += 2;
                else break;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1588().sumOddLengthSubarrays(new int[]{10, 11, 12}));
    }
}
