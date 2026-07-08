# 3925. Concatenate Array With Reverse
# https://leetcode.com/problems/concatenate-array-with-reverse/

class Solution {
    public int[] concatWithReverse(int[] nums) {

        int [] result = new int [nums.length + nums.length];

        for(int i=0 ; i< nums.length  ; i++){

            result[i]=nums[i];

            result[ result.length-1-i]= nums[i];
        } 

        return result;       
    }
}