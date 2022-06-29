package my.solutions;

import java.util.Arrays;

public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[] flat = Arrays.stream(mat).flatMapToInt(Arrays::stream).toArray();
        int[][] reshaped = new int[r][c];
        int flat_pos = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++, flat_pos++) {
                if (flat_pos < flat.length) reshaped[row][col] = flat[flat_pos];
            }
        }
        return reshaped;
    }

    public static void main(String[] args) {
        new Solution566().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);
    }
}
