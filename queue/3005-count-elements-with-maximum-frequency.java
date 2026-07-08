# 3005. Count Elements With Maximum Frequency
# https://leetcode.com/problems/count-elements-with-maximum-frequency/

class Solution {
    public int maxFrequencyElements(int[] nums) {


        if(nums.length ==1){

            return 1;
        }

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){

            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }

            else{
                hm.put(nums[i],1);
            }
        }
        
        int max=0;

        for(int x : hm.keySet()){

            max = Math.max(max,hm.get(x));
        }

        int tot=0;


        for(int x : hm.keySet()){

           if(hm.get(x)==max){
           tot+=max;
           }
        }

        


        return tot;





        


        
    }
}