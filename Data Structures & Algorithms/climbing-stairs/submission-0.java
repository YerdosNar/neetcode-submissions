class Solution {
    public int climbStairs(int n) {
        int i = 0, j = 1;
        for (int k = 0; k < n; k++) {
            int temp = j;
            j = i + j;
            i = temp;
        }
        return j;
    }
}
