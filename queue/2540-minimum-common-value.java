# 2540. Minimum Common Value
# https://leetcode.com/problems/minimum-common-value/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {


        int cm= Integer.MAX_VALUE;

        int n= nums1.length;
        int m= nums2.length;
        int i=0; int j=0;

        

        while(i<n &&  j<m){


            int current =0;


            if(nums1[i]==nums2[j]){
                current = nums1[i] ;

                if(cm>current){
                    cm=current;
                }
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }


              }

        if(cm==Integer.MAX_VALUE){return -1;}

        return cm;
        
    }
}