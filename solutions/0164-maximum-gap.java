# 164. Maximum Gap
# https://leetcode.com/problems/maximum-gap/

class Solution {
    public int maximumGap(int[] nums) {
        


        if(nums.length == 1 ){
              return 00;

        }

        else{

            Arrays.sort(nums);
            int i = 0 ; int j= 1;

            int max_gap = Integer.MIN_VALUE;
            while(i<nums.length-1 && j<nums.length){

                int curr_sum = Math.abs(nums[i]-nums[j]);

                max_gap = Math.max(curr_sum,max_gap);
                i++;
                j++;
            }

            return max_gap;


        }
    }
}