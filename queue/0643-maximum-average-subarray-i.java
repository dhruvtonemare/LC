# 643. Maximum Average Subarray I
# https://leetcode.com/problems/maximum-average-subarray-i/

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int l=0;

        int h=0;

        double max= Integer.MIN_VALUE;
        
        double curr =0;
        while(h<nums.length){
            
             curr += nums[h];

            if(h-l+1 == k){
                 max = Math.max(max, curr / k);

                curr -= nums[l];
                l++;
                System.out.println(max);



            }

           
                h++;
            
        }


        return max;
        
    }
}