# 2144. Minimum Cost of Buying Candies With Discount
# https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/

class Solution {
    public int minimumCost(int[] cost) {


         if(cost.length ==1){
            return cost[0];
        }


        if(cost.length ==2){
            return cost[0]+cost[1];
        }

        Arrays.sort(cost);

        int x=1;

        int ans=0;

        for(int i= cost.length -1 ; i>=0 ; i--){

            if(x%3 == 0 ){
                x++;
                continue;
            }

            else{
                x++;
                ans+=cost[i];
            }


        }

        

      


          return ans;
        
        
    }
}