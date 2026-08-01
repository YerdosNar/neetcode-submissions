class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) set.add(i);
        int longest = 0;
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int num = iter.next();
            if (!set.contains(num-1)) {
                int length = 1;
                while (set.contains(num+length)) {
                    length++;
                }
                if (longest < length) longest = length;
            }
        }
        return longest;
    }
}
