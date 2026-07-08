# 2341. Maximum Number of Pairs in Array
# https://leetcode.com/problems/maximum-number-of-pairs-in-array/

class Solution {
    public int[] numberOfPairs(int[] nums) {

         int [] result = new int[2];


         Set <Integer>s = new HashSet<>();

         int pairs=0;


         for(int i=0 ; i<nums.length ; i++){

            if(s.contains(nums[i])){
                s.remove(nums[i]);
                pairs++;
            }

            else{
                s.add(nums[i]);
            }
         }


         result[0]=pairs;

         result[1]=s.size();

         return  result;



        
    }
}