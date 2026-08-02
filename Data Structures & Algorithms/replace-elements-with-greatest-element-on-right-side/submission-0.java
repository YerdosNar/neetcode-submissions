class Solution {
    public int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        int rMax = -1;
        for (int i = arr.length-1; i >= 0; i--) {
            res[i] = rMax;
            if (rMax < arr[i]) rMax = arr[i];
        }
        return res;
    }
}