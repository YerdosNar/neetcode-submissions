class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int zeros = 0;
        int prod = 1;
        for (int i : nums) {
            if (i == 0) {
                zeros++;
                if (zeros > 1) return res;
                continue;
            }
            prod *= i;
        }

        for (int i = 0; i < res.length; i++) {
            if (nums[i] == 0) res[i] = prod;
            else if (zeros == 1) res[i] = 0;
            else res[i] = prod / nums[i];
        }
        return res;
    }
}  
