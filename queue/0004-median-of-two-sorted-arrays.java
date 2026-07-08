# 4. Median of Two Sorted Arrays
# https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length+nums2.length;

        int arr [] = new int [n]; 
        int i=0, j=0, z = 0;

        while(i < nums1.length && j < nums2.length){
            
             if(nums1[i]<=nums2[j]){
                arr[z]= nums1[i];
                z++;
                i++;
             }
             
             else if(nums2[j]<nums1[i]){
                arr[z]=nums2[j];
                z++;
                j++;
             }


        }

       
        

       while(i<nums1.length){
        arr[z++]=nums1[i++];
       }
       while(j<nums2.length){
        arr[z++]=nums2[j++];
       }


      
       if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
        
        
    }
}