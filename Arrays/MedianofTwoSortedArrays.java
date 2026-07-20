package Arrays;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mergeArray[] = new int[m+n];
        for(int i = 0;i < m;i++){
            
                mergeArray[i] = nums1[i];
        }
        for(int j = 0;j < n;j++){
            mergeArray[m+j] = nums2[j];

        } 
        Arrays.sort(mergeArray);
        
        int len = mergeArray.length;

        if(len % 2 == 1){
           return mergeArray[len / 2];
        }
        else{
            return (mergeArray[len / 2 - 1] + mergeArray[len / 2]) / 2.0;
        }
    }
}
public static void main(String[] args) {
    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    Solution solution = new MedianofTwoSortedArrays().new Solution();
    double median = solution.findMedianSortedArrays(nums1, nums2);
    System.out.println("Median: " + median);
}
}
