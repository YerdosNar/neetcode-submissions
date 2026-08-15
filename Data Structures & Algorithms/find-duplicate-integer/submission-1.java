class Solution {
    public int findDuplicate(int[] nums) {
        int find[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i];
            if (find[idx] != 0) return nums[i];
            find[idx]++;
        }
        return -1;
    }
}
