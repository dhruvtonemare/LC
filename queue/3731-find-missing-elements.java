# 3731. Find Missing Elements
# https://leetcode.com/problems/find-missing-elements/

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

       

        List<Integer>result = new  ArrayList<>();

        Set <Integer >s= new HashSet<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){
        
           if(nums[i]<min){
            min=nums[i];
           }

            if(nums[i]>max){
            max =nums[i];
           }


         s.add(nums[i]);
        }

         for(int i=min+1; i<max ; i++){
        
            if(!s.contains(i)) result.add(i);
        }


          return result;
    }
}