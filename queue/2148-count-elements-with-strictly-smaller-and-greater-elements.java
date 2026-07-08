# 2148. Count Elements With Strictly Smaller and Greater Elements 
# https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/

class Solution {
    public int countElements(int[] nums) {

        if(nums.length ==1  && nums.length ==2){

            return 0;
        }

        Arrays.sort(nums);


        int i=nums[0] ;
        int j=nums[nums.length -1];

        int k=1;

        int strict=0;

        while(k<= nums.length-1){
            if(nums[k]!=i && nums[k] != j){
                strict++;
            }
            k++;
        }


        return strict;
    }
}