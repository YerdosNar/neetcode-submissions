class Solution {
    private boolean isValidBox(char[][] board, int row, int col) {
        int nums[] = new int[9];
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0';
                    if (nums[digit-1] == 1) return false;
                    nums[digit-1]++;
                }
            }
        }
        return true;
    }
    private boolean isValidRow(char[][] board, int row) {
        int nums[] = new int[9];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.') {
                int digit = board[row][i] - '0';
                if (nums[digit-1] == 1) return false;
                nums[digit-1]++;
            }
        }
        return true;
    }
    private boolean isValidCol(char[][] board, int col) {
        int nums[] = new int[9];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                int digit = board[i][col] - '0';
                if (nums[digit-1] == 1) return false;
                nums[digit-1]++;
            }
        }
        return true;
    }
        
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i+= 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                if (!isValidBox(board, i, j)) return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (!isValidRow(board, i)) return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (!isValidCol(board, i)) return false;
        }
        return true;
    }
}
