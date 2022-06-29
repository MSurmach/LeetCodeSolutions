package my.solutions;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length == 1 && mat[0].length == 1) return mat[0][0];
        int prim_index = 0, sec_index = mat[0].length - 1;
        for (int row = 0; row < mat.length; row++) {
            if (prim_index != sec_index) {
                sum += mat[row][prim_index] + mat[row][sec_index];
            } else sum += mat[row][prim_index];
            prim_index++;
            sec_index--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1572().diagonalSum(new int[][]{{5}}));
    }
}
