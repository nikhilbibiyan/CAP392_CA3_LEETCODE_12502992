class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] aary = new int[nums1.length + nums2.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            aary[k++] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            aary[k++] = nums2[j];
        }

        Arrays.sort(aary);

        int len = aary.length;

        if (len % 2 == 0) {
            return (aary[len / 2 - 1] + aary[len / 2]) / 2.0;
        } else {
            return aary[len / 2];
        }
    }
}
