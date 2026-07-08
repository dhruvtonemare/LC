# 3688. Bitwise OR of Even Numbers in an Array
# https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/

class Solution {
    public int evenNumberBitwiseORs(int[] nums) {


        int result =0;


        for(int i=0 ; i<nums.length; i++){

            if(nums[i]%2 == 0){
                result |= nums[i]; 
            }
        }



        return result;

        
    }
}