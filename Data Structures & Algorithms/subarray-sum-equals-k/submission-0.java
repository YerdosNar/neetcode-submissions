class Solution {
    public int subarraySum(int[] nums, int k) {
        int sums[] = new int[nums.length+1];
        sums[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sums[i+1] = nums[i] + sums[i];
        }

        int res = 0;
        for (int i = 0; i < sums.length-1; i++) {
            for (int j = i+1; j < sums.length; j++) {
                if (sums[j] - sums[i] == k) res++;
            }
        }
        return res;
    }
}