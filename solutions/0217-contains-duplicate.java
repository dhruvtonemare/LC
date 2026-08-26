# 217. Contains Duplicate
# https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer ,Integer> hm  = new HashMap<>();

        for(int i =0 ; i<nums.length ; i++){

            int current = nums[i];

            if(hm.containsKey(current)){
                return true;
            }
            hm.put(current,hm.getOrDefault(current, 0)+1);
        }

        return false;
        
    }
}