package my.solutions;

public class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;
        int[] firstPoint = coordinates[0];
        int[] secondPoint = coordinates[1];
        for (int pointNumber = 2; pointNumber < coordinates.length; pointNumber++) {
            if (!isOnLine(firstPoint, secondPoint, coordinates[pointNumber])) return false;
        }
        return true;
    }

    private boolean isOnLine(int[] firstPoint, int[] secondPoint, int[] n_thPoint) {
        int x_diff = secondPoint[0] - firstPoint[0];
        int y_diff = secondPoint[1] - firstPoint[1];
        return (n_thPoint[0] - firstPoint[0]) * y_diff == (n_thPoint[1] - firstPoint[1]) * x_diff;
    }

    public static void main(String[] args) {
        int[] firstPoint = new int[]{1, 2};
        int[] secondPoint = new int[]{2, 3};
        int[] thirdPoint = new int[]{3, 4};
        System.out.println(new Solution1232().isOnLine(firstPoint, secondPoint, thirdPoint));
    }
}
