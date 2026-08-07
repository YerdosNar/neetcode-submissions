class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = counter.get(nums[i]);
            if (count == null) {
                counter.put(nums[i], 1);
            } else {
                counter.put(nums[i], count+1);
            }
        }

        List<int[]> arr = new ArrayList<>();
        for (int i:counter.keySet()) {
            arr.add(new int[]{counter.get(i), i});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
