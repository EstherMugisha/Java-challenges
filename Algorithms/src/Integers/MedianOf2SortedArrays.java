package Integers;

public class MedianOf2SortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double min = 0;
        double max = 0;
        if(nums1.length == 0 && nums2.length > 0){
            if(nums2.length == 1){
                return (nums2[0]/2);
            }
            return (nums2[0]+nums2[nums2.length-1]);
        }
        else if(nums2.length == 0 && nums1.length > 0){
            if(nums1.length == 1){
                return (nums1[0]/2);
            }
            return (nums1[0]+nums1[nums1.length-1]);
        }
        else if(nums1.length == 0 && nums2.length == 0){
            return 0;
        }
        else {
            if (nums1[0] <= nums2[0]) {
                min = nums1[0];
            } else {
                min = nums2[0];
            }
            if (nums1[nums1.length - 1] >= nums2[nums2.length - 1]) {
                max = nums1[nums1.length - 1];
            } else {
                max = nums2[nums2.length - 1];
            }
            return (max + min) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1={2,3,4,5,9};
        int[] nums2={1,9,6,10};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
