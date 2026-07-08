# 1672. Richest Customer Wealth
# https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {


        int max = Integer.MIN_VALUE;

        for(int i=0 ;i<accounts.length ; i++){

          int curr=0;
          for(int j=0 ;j<accounts[0].length ; j++){
           curr+=accounts[i][j];

            
        }  

        if(curr>max){
            max=curr;
        }
        }


        return max;
        
    }
}