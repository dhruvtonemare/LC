# 2706. Buy Two Chocolates
# https://leetcode.com/problems/buy-two-chocolates/

class Solution {
    public int buyChoco(int[] prices, int money) {

        int f= Integer.MAX_VALUE;

        int s= Integer.MAX_VALUE;


        for(int i=0 ; i<prices.length; i++){

            int current = prices[i];

            if(current <= f){
                s=f;
                f=current;
            }

            else if (current <= s){
                s= current;
            }
        }



        if(s+f<=money){

            money-=s+f;

            return money;
        }

        return money;
        
    }
}