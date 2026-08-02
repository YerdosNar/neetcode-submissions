class Solution {
    private static final int LETTERS = 26;
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int l1[] = new int[LETTERS];
        int l2[] = new int[LETTERS];
        for (int i = 0; i < n1; i++) {
            l1[s1.charAt(i) - 'a']++;
            l2[s2.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < LETTERS; i++) {
            if (l1[i] == l2[i]) count++;
        }

        for (int i = n1; i < n2; i++) {
            if (count == LETTERS) return true;

            int idx = s2.charAt(i) - 'a';
            l2[idx]++;
            if (l1[idx] == l2[idx]) count++;
            else if (l1[idx] + 1 == l2[idx]) count--;

            idx = s2.charAt(i-n1) - 'a';
            l2[idx]--;
            if (l1[idx] == l2[idx]) count++;
            else if (l1[idx] - 1 == l2[idx]) count--;
        }
        return count == LETTERS;
    }
}
