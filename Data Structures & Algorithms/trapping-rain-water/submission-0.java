class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int maxL[] = new int[len];
        int maxR[] = new int[len];
        maxL[0] = 0;
        maxR[len-1] = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int  min[] = new int[len];
        for (int i = len-2; i >= 0; i--) {
            maxR[i] = Math.max(maxRight, height[i+1]);
            maxRight = Math.max(maxRight, height[i+1]);
        }
        for (int i = 1; i < len; i++) {
            maxL[i] = Math.max(maxLeft, height[i-1]);
            maxLeft = Math.max(maxLeft, height[i-1]);
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            int trap = (Math.min(maxL[i], maxR[i])) - height[i];
            if (trap > 0) res += trap;
        }
        return res;
    }
}
