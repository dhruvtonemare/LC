# 3852. Smallest Pair With Different Frequencies
# https://leetcode.com/problems/smallest-pair-with-different-frequencies/

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        int [] result = new int[2];

        int n= nums.length;

        if(n<=2){
            result[0]=-1;

            result[1]=-1;

            return result;
        }

        
     
         Arrays.sort(nums);
        HashMap<Integer, Integer>hm = new HashMap<>();

        for(int i =0 ; i< n ;i++){

            if(hm.containsKey(nums[i])){

                hm.put(nums[i],hm.get(nums[i])+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }


        int fs= hm.get(nums[0]);


        
          

        for(int i =1; i<n ; i++){

            int ss= hm.get(nums[i]);

            if(nums[i]>nums[0] && fs!=ss){

                result[0]=nums[0];
                result[1]= nums[i];
                return result;
            }


        }


         result[0]=-1;

            result[1]=-1;

            return result;

        

        
        
    }
}