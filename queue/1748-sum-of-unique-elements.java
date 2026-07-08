# 1748. Sum of Unique Elements
# https://leetcode.com/problems/sum-of-unique-elements/

class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                 hm.put(nums[i],1);
            }
        }
        int sum =0 ; 
        for(int i=0 ; i<nums.length ; i++){
          
        int freq = hm.get(nums[i]);
          if(freq==1){
            sum+=nums[i];
          }
        }


        return sum;
        
    }
}