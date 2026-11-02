# 961. N-Repeated Element in Size 2N Array
# https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

class Solution {
    public int repeatedNTimes(int[] nums) {

        Set<Integer>s = new HashSet<>();

        for(int i =0 ; i<nums.length ; i++){

            if(s.contains(nums[i])){
                return nums[i];
          }

          s.add(nums[i]);


        }


        return nums.length;
        
    }
}