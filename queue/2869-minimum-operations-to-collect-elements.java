# 2869. Minimum Operations to Collect Elements
# https://leetcode.com/problems/minimum-operations-to-collect-elements/

class Solution {
    public int minOperations(List<Integer> nums, int k) {

        Set<Integer>s = new HashSet<>();



        int ops =0; 

        int i = nums.size()-1;

        while(i>=0 ){

            

           
             if(!s.contains(nums.get(i)) && nums.get(i)<=k){
                s.add(nums.get(i));
                ops++;
                if(s.size()==k){
                    break;
                }
            }

            else if(s.contains(nums.get(i)) || nums.get(i)> k ){
                i--;
                ops++;
                continue;
                
            }





            
            i--;
 }

        return ops;
        
    }
}