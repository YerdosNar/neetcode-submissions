class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int l1[] = new int[26];
        for (char c:s1.toCharArray()) l1[c - 'a']++;

        int l2[] = new int[26];
        for (int i = 0; i < n1; i++) {
            l2[s2.charAt(i) - 'a']++;
        }

        for (int i = n1; i < n2; i++) {
            if (Arrays.equals(l1, l2)) return true;
            l2[s2.charAt(i) - 'a']++;
            l2[s2.charAt(i-n1) - 'a']--;
        }
        return Arrays.equals(l1, l2);
    }
}
