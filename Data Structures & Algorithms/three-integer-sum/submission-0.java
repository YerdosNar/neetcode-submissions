class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1, r = nums.length - 1;
            int target = -1 * nums[i];
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    if (!set.contains(temp)) {
                        list.add(temp);
                        set.add(temp);
                    }
                }
                if (sum > target) r--;
                else l++;
            }
        }
        return list;
    }
}
