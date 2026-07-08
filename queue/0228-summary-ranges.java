# 228. Summary Ranges
# https://leetcode.com/problems/summary-ranges/

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String>res= new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){

            if(i==nums.length -1){

                String x = String.valueOf(nums[i]);
                res.add(x);

            }

          else  if( nums[i+1]!=nums[i]+1){
                String x = String.valueOf(nums[i]);
                res.add(x);
            }

            else if(nums[i+1]==nums[i]+1){
                StringBuilder sb = new StringBuilder("");
                String s=String.valueOf(nums[i]);
                int end =0;

                while(i<nums.length-1 && nums[i+1]==nums[i]+1){
                   
                    
                    end =nums[i];
                    i++;
                    

                }
                

                sb.append(s+"->"+String.valueOf(end+1));

                res.add(sb.toString());

            }
        }


        return res;
        
    }
}