# 54. Spiral Matrix
# https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top boundary
            for (int col = startCol; col <= endCol; col++) {
                result.add(matrix[startRow][col]);
            }

            // Right boundary
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(matrix[row][endCol]);
            }

            // Bottom boundary (only if there are remaining rows)
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    result.add(matrix[endRow][col]);
                }
            }

            // Left boundary (only if there are remaining columns)
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    result.add(matrix[row][startCol]);
                }
            }

            // Move inward for the next layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}