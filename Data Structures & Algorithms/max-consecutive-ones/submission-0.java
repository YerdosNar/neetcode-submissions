class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 1) {
                i++;
                continue;
            }
            int count = 0;
            while (i < nums.length && nums[i] == 1) {
                count++;
                i++;
            }
            if (max < count) max = count;
        }
        return max;
    }
}