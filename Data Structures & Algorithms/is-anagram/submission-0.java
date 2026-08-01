class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map1.containsKey(c)) {
                int val = map1.get(c);
                map1.put(c, val+1);
            }
            else {
                map1.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map1.containsKey(c)) {
                int val = map1.get(c);
                if (val == 1) {
                    map1.remove(c);
                } else {
                    map1.put(c, val-1);
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
