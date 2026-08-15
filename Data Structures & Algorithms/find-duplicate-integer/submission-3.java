class Solution {
    private void print(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.println(nums[nums.length-1]+"]");
    }

    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) return Math.abs(nums[i]);
            nums[idx] *= -1;
            //print(nums);
        }
        return -1;
    }
}
