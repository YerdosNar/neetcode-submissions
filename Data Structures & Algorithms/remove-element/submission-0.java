class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0, j = 0;
        while (i+j < len) {
            while (i+j < len && nums[i+j] == val) {
                j++;
            }
            if (i+j == len) break;
            int temp = nums[i];
            nums[i] = nums[i+j];
            nums[i+j] = temp;
            i++;
        }
        return i;
    }
}