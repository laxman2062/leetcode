class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m+n];

        int k = 0;

        for (int num:nums1) {
            arr[k++] = num;
        }
        for(int num:nums2) {
            arr[k++] = num;
        }
        Arrays.sort(arr);

        int len = arr.length;

        if (len%2 == 1) {
            return arr[len / 2];
        }

        return (arr[len / 2-1] + arr[len / 2]) / 2.0;
    }
}