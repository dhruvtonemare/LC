# 3151. Special Array I
# https://leetcode.com/problems/special-array-i/

class Solution {
    public boolean isArraySpecial(int[] nums) {

        
        if(nums.length==1){
            return true;
        }

        for(int i=1 ; i<nums.length ; i++){

            if(nums[i]%2==0){

                if(nums[i-1]%2==0){
                       return false;
                }
            }

             if(nums[i]%2!=0){

                if(nums[i-1]%2!=0){
                       return false;
                }
            }

            
        }





        return true;
        
    }
}