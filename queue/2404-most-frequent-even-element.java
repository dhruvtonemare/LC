# 2404. Most Frequent Even Element
# https://leetcode.com/problems/most-frequent-even-element/

class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer,Integer>hm= new HashMap<>();

       

        for(int i=0 ;i <nums.length ; i++){

            int curr=nums[i];
            if(curr%2==0){
                if(hm.containsKey(curr)){
                    hm.put(curr,hm.get(curr)+1);
                }

                else{
                hm.put(curr,1);
            }
            }

            
        }
        
       

        if(hm.isEmpty()){
            return -1;
        }

         int x=hm.keySet().iterator().next();
        for(int n :hm.keySet()){

            if(hm.get(n) ==hm.get(x)){
                int min = Math.min(x,n);
                x=min;
            }
            else if(hm.get(n) >hm.get(x)){
                x=n;
            }
        }
        

            
       

        return x;


        
    }
}