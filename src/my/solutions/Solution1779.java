package my.solutions;

public class Solution1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int manhattanDistance = -1, manhattanPosition = -1;

        for (int position = 0; position < points.length; position++) {
            int point_x = points[position][0];
            int point_y = points[position][1];
            if (x == point_x || y == point_y) {
                int distance = Math.abs(x - point_x) + Math.abs(y - point_y);
                if (manhattanDistance == -1 || distance < manhattanDistance) {
                    manhattanDistance = distance;
                    manhattanPosition = position;
                }
            }
        }
        return manhattanPosition;
    }
}
