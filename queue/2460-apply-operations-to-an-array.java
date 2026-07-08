# 2460. Apply Operations to an Array
# https://leetcode.com/problems/apply-operations-to-an-array/

class Solution {
    public int[] applyOperations(int[] nums) {

        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }


        int i=0 ;
        int j=0;

        while(i<nums.length){

           if(nums[i] == 0) {

                j = i + 1;

                while(j < nums.length && nums[j] == 0) {
                    j++;
                }

                if(j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            i++;
        }



        return nums;
        
    }
}