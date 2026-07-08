# 1827. Minimum Operations to Make the Array Increasing
# https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/

class Solution {
    public int minOperations(int[] nums) {

        int operations=0;

        int n=nums.length;


        if(n==1){
            return 0;

        }

        int i=0;

        int j=i+1;


        while(i<n-1 && j <n){

            if(nums[i]>=nums[j]){
               int req=(nums[i]-nums[j])+1;
               nums[j]+=req;
                operations+=req;

            }
            i++;
            j++;
        }




        return operations;
    }
}