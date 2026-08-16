class NumMatrix {
    private int[][] sums;
    //private void print(int [][]matrix) {
    //    for (int row = 0; row < matrix.length; row++) {
    //        System.out.print("[");
    //        for (int i = 0; i < matrix[row].length-1; i++) {
    //            System.out.printf("%3d, ", matrix[row][i]);
    //        }
    //        System.out.printf("%3d]\n", matrix[row][matrix[row].length-1]);
    //    }
    //    System.out.println("SUM: ");
    //
    //    for (int row = 0; row < sums.length; row++) {
    //        System.out.print("[");
    //        for (int i = 0; i < sums[row].length-1; i++) {
    //            System.out.printf("%3d, ", sums[row][i]);
    //        }
    //        System.out.printf("%3d]\n", sums[row][sums[row].length-1]);
    //    }
    //}

    public NumMatrix(int[][] matrix) {
        sums = new int[matrix.length][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                sums[i][j+1] = sum;
            }
        }
        //print(matrix);
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            sum += (sums[i][col2+1] - sums[i][col1]);
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */