class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                if (res < nums[l]) return res;
                return nums[l];
            }

            int m = ((r - l) / 2) + l;
            if (res > nums[m]) res = nums[m];
            System.out.println("L: "+nums[l] +
                              " M: "+nums[m] +
                              " R: "+nums[r]);
            if (nums[l] <= nums[m]) l = m + 1;
            else r = m - 1;
        }

        return res;
    }
}
