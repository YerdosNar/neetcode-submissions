class Solution {
    private int[] mergeTwo(int n1[], int n2[]) {
        int arr[] = new int[n1.length + n2.length];
        int i1 = 0, i2 = 0;
        int i = 0;
        while (i1 < n1.length && i2 < n2.length) {
            if (n1[i1] < n2[i2]) {
                arr[i++] = n1[i1++];
            }
            else {
                arr[i++] = n2[i2++];
            }
        }

        while (i1 < n1.length) arr[i++] = n1[i1++];
        while (i2 < n2.length) arr[i++] = n2[i2++];
        return arr;
    }
    private void printArr(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = mergeTwo(nums1, nums2);
        printArr(arr);
        int len = arr.length;
        int mid = len / 2;
        if (len % 2 == 0) {
            return (float)(arr[mid] + arr[mid-1]) / 2;
        }
        else {
            return (float)arr[mid];
        }
    }
}
