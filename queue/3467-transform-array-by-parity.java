# 3467. Transform Array by Parity
# https://leetcode.com/problems/transform-array-by-parity/

class Solution {
    public int[] transformArray(int[] nums) {

        int [] result = new int [nums.length];

        int zero,one;
        zero=one=0;

        for(int i=0;i<nums.length; i++){
            
            if(nums[i]%2==0){zero++;}
            else{one++;}
        }

        for(int i=zero;i<nums.length ; i++){
            result[i]=1;
        }


        return result;
    }
}