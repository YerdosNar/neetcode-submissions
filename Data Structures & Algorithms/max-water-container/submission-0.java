class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length-1;
        int dis = r - l;
        int max = Math.min(h[l], h[r]) * dis;
        while (l < r) {
            int volume = Math.min(h[l], h[r]) * dis;
            if (max < volume) max = volume;
            if (h[l] >= h[r]) r--;
            else l++;
            dis--;
        }
        return max;
    }
}
