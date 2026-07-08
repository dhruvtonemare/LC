# 3861. Minimum Capacity Box
# https://leetcode.com/problems/minimum-capacity-box/

class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {

        int pos=-1;

        int diff= Integer.MAX_VALUE;

        for(int i=0 ; i<capacity.length ; i++){

            if(capacity[i]>=itemSize){
                
            



    
            int curr= Math.abs(capacity[i]-itemSize);

            if(curr < diff){

                diff= curr;
                pos=i;

            }


            }

           

        }

        return pos;
        
    }
}