class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            int diff = (nums[l] + nums[r] - target);
            if (diff == 0) {
                int ret[] = {l+1, r+1};
                return ret;
            }
            else if (diff > 0) {
                r--;
            }
            else {
                l++;
            }
        }
        int ret[] = {-1, -1};
        return ret;
    }
}
