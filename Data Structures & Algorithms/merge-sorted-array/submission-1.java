class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n--; m--;
        int i = nums1.length - 1;
        while (i >= 0 && n >= 0 && m >= 0) {
            int n1 = nums1[m];
            int n2 = nums2[n];
            if (n1 > n2) {
                nums1[i] = n1;
                m--;
            } else {
                nums1[i] = n2;
                n--;
            }
            i--;
        }
        if (n < 0) {
            while (i >= 0) {
                nums1[i] = nums1[m];
                i--;
                m--;
            }
        } 
        else if (m < 0) {
            while (i >= 0) {
                nums1[i] = nums2[n];
                i--;
                n--;
            }
        }
    }
}