# 121. Best Time to Buy and Sell Stock
# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public  static int maxProfit(int[] prices) {
        int minprice= Integer.MAX_VALUE;
        int maxprofit=0;

        if(prices==null){
            return 0;
        }

        for(int i=0;i<prices.length;i++){
        if(prices[i]<minprice){
          minprice=prices[i];
           }
           else if(prices[i]- minprice > maxprofit){
            maxprofit=prices[i]- minprice;
           }

          
                       
        }
         return maxprofit;
    }
    





        
        public static void main(String[] args){
             int[] prices ={7,6,4,3,1};
             maxProfit( prices);




        
    }
}