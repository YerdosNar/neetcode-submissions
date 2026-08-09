class Solution {
    private int bits(int n) {
        int sum = 0;
        while (n != 0) {
            n = (n-1) & n;
            sum++;
        }
        return sum;
    }

    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            res[i] = bits(i);
        }
        return res;
    }
}
