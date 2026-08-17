# 169. Majority Element
# https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
      int sol =0;
      int count =0;


    for(int i =0; i<= nums.length-1; i++){
     
     if(count ==0){
        sol = nums[i];
        count ++;
     }
     else if (sol == nums[i]){
        count ++;
     }
     else{
        count--;
     }

    }    
        return sol;

    }
}