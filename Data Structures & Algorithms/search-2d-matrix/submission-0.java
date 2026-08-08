class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while (up <= down && left <= right) {
            int midRow = (up + down) / 2;
            System.out.println("MR: "+midRow+", UP: "+up+", D: "+down);
            if (target >= matrix[midRow][left] && target <= matrix[midRow][right]) {
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (matrix[midRow][mid] == target) return true;
                    else if (matrix[midRow][mid] > target) right = mid-1;
                    else left = mid + 1;
                }
            }
            else if (target < matrix[midRow][left]) {
                down = midRow - 1;
            }
            else if (target > matrix[midRow][right]) {
                up = midRow + 1;
            }
        }
        return false;
    }
}
