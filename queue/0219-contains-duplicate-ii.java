# 219. Contains Duplicate II
# https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer>h = new HashMap<>();

        

        for(int i =0 ; i<nums.length ; i++){
             

             if(h.containsKey(nums[i])){
                 
                

                 if(Math.abs(i-h.get(nums[i]))<=k){

                    return true;

                 }



             }

          

                h.put(nums[i],i);
             


        }

        return false ;

        
    }
}