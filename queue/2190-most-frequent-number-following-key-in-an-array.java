# 2190. Most Frequent Number Following Key In an Array
# https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/

class Solution {
    public int mostFrequent(int[] nums, int key) {


        HashMap<Integer, Integer>  hm = new HashMap<>();

        for(int i=0 ; i<nums.length-1 ; i++){

            int target =0;

            if(nums[i]==key){

                target= nums[i+1];

                if(hm.containsKey(target)){
                    hm.put(target,hm.get(target)+1);
                }

                else{
                    hm.put(target,1);
                }

            }
        }



        int max =0;

        int curr=0;

        for(int y : hm.keySet() ){

            if(hm.get(y)>curr){
                curr=hm.get(y);
                max= y;
            }
        }


           





        return max;
    }
}