class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, c = 1;
        while (j < nums.length) {
            System.out.println("I: "+nums[i]+", J: "+nums[j]);
            if (nums[i] == nums[j]) {
                j++;
                continue;
            }
            nums[++i] = nums[j++];
            c++;
        }
        return c;
    }
}