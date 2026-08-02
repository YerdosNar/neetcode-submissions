class Solution {
    public int trap(int[] height) {
        int maxL = 0;
        int maxR = 0;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (max <= height[i]) {
                if (max <  height[i]) {maxL = i;maxR = i;}
                if (max == height[i]) maxR = i;
                max = height[i];
            }
        }
        int res = 0;
        int lmax = 0;
        for (int i = 1; i < maxL; i++) {
            lmax = Math.max(lmax, height[i-1]);
            int trapAt = lmax - height[i];
            if (trapAt > 0) res += trapAt;
        }
        for (int i = maxL+1; i < maxR; i++) {
            res += (max - height[i]);
        }
        int rmax = 0;
        for (int i = height.length-2; i > maxR; i--) {
            rmax = Math.max(rmax, height[i+1]);
            int trapAt = rmax - height[i];
            if (trapAt > 0) res += trapAt;
        }
        return res;
    }
}