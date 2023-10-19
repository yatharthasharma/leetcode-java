package com.leetcode.binarysearch.matrix2D;

public class Matrix2D {
    private boolean searchRow(int[] array, int target) {
        int p1 = 1;
        int p2 = array.length - 2;
        while (p1 <= p2) {
            int mid = (p1 + p2) / 2;
            if (target == array[mid]) {
                return true;
            } else if (target < array[mid]) {
                p2 = mid - 1;
            } else {
                p1 = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int p1 = 0;
        int p2 = m - 1;
        while (p1 <= p2) {
            int mid = (p1 + p2) / 2;
            if (target == matrix[mid][0] || target == matrix[mid][n - 1]) {
                return true;
            }
            if (target > matrix[mid][0] && target < matrix[mid][n - 1]) {
                return searchRow(matrix[mid], target);
            }
            if (target > matrix[mid][0]) {
                p1 = mid + 1;
            } else {
                p2 = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Matrix2D matrix2D = new Matrix2D();
        System.out.println(matrix2D.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20}, {23, 30, 34, 60}}, 13));
    }
}
