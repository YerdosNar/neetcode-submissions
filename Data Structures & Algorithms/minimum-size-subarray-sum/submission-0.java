class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(i - l + 1, res);
                sum -= nums[l++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}