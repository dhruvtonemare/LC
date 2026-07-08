# 1. Two Sum
# https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int  [] result = new int[2];


        HashMap<Integer , Integer> h = new HashMap<>();

        for(int i =0 ; i<nums.length; i++){

            int req = target - nums[i];

            if(h.containsKey(req)){

                result [0]=i;
                result[1]=h.get(req);

                return result;
           }

           else{
            h.put(nums[i],i);
           }
        }


      result [0]=-1;
                result[1]=-1;


                return result;

        
    }
}