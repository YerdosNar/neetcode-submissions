class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m + n - 1
        m -= 1
        n -= 1
        while i >= 0 and m >= 0 and n >= 0:
            n1 = nums1[m]
            n2 = nums2[n]
            if n1 > n2:
                nums1[i] = nums1[m]
                m -= 1
            else:
                nums1[i] = nums2[n]
                n -= 1
            i -= 1
        
        if m < 0:
            while i >= 0:
                nums1[i] = nums2[n]
                i -= 1
                n -= 1
        else:
            while i >= 0:
                nums1[i] = nums1[m]
                i -= 1
                m -= 1
        