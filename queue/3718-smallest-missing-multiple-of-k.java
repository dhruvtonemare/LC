# 3718. Smallest Missing Multiple of K
# https://leetcode.com/problems/smallest-missing-multiple-of-k/

class Solution {
    public int missingMultiple(int[] nums, int k) {

        Set<Integer>s = new HashSet<>();

        for(int i=0 ; i< nums.length; i++){
            s.add(nums[i]);
        }
       

        for(int i=k ; i<Integer.MAX_VALUE; i+=k){
            if(!s.contains(i)){
               return i;
            }
        }

        return -1;
        
    }
}