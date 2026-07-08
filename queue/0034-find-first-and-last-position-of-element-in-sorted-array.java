# 34. Find First and Last Position of Element in Sorted Array
# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] result = new int[]{-1,-1};

        for(int i =0;i<=nums.length-1;i++){
               
               if(nums[i]== target){
                result[0]= i;
                break;
               }

        }

        for(int j =nums.length-1;j>=0;j--){
               
               if(nums[j]== target){
                  result[1]= j;
                  break;
               }

        }


         
        return result;
    }
}