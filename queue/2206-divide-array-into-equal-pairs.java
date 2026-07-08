# 2206. Divide Array Into Equal Pairs
# https://leetcode.com/problems/divide-array-into-equal-pairs/

class Solution {
    public boolean divideArray(int[] nums) {

           int n = nums.length;
           int pairs = n/2;

           Arrays.sort(nums);

           int i=0;

           while(i<n){

            

            if(nums[i]!=nums[i+1]){
               return false;
            }


           i+=2;
           }


         return true;
        
    }
}