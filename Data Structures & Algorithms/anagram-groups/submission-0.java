class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < strs.length; i++) {
            char cs[] = strs[i].toCharArray();
            Arrays.sort(cs);
            String str = new String(cs);
            if (map.containsKey(str)) {
                res.get(map.get(str)).add(strs[i]);
            } else {
                map.put(str, idx++);
                List <String> list = new ArrayList<>();
                list.add(strs[i]);
                res.add(list);
            }
        }
        return res;
    }
}
