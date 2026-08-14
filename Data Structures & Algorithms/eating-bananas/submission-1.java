class Solution {
    private long timeToEat(int[] piles, int speed) {
        long time = 0;
        for (int p:piles) time += (int)Math.ceil((double)p / speed);
        return time;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = piles[0];
        for (int i:piles) if (r < i) r = i;
        int res = r;
        System.out.println("L: "+l+", R: "+r);

        while (l <= r) {
            int m = ((r - l) / 2) + l;
            long time = timeToEat(piles, m);
            if (time <= h) {
                res = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return res;
    }
}
