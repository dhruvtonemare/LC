# 3712. Sum of Elements With Frequency Divisible by K
# https://leetcode.com/problems/sum-of-elements-with-frequency-divisible-by-k/

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {


        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }



        int sum =0;

   for (int i : hm.keySet()) {
    Integer count = hm.get(i); 
    if (count!= null && count % k == 0) {
        sum += i * count;
    }
}


        return sum;




        
    }
}