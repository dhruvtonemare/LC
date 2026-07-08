# 674. Longest Continuous Increasing Subsequence
# https://leetcode.com/problems/longest-continuous-increasing-subsequence/

class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int l=1;
        int curr =1;
        for(int i=1 ; i<nums.length; i++){
            
            if(nums[i]>nums[i-1]){
              
              curr++;
            }
            else{
                l=Math.max(curr,l);
                curr=1;
            }
        }
         l=Math.max(curr,l);

        return l;
        
    }
}