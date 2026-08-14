class Solution {
    private int binSearch(int arr[], int target, int left, int right) {
        while (left <= right) {
            int mid = ((right - left) / 2) + left;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else if (arr[mid] > target) right= mid - 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = ((r - l) / 2) + l;
            if (nums[m] > nums[r]) l = m+1;
            else                   r = m;
        }

        int result = binSearch(nums, target, 0, l-1);
        if (result != -1) return result;

        return binSearch(nums, target, l, nums.length - 1);
    }
}