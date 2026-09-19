# 441. Arranging Coins
# https://leetcode.com/problems/arranging-coins/

class Solution {
    public int arrangeCoins(int n) {

        if(n==1 || n==2){

            return 1;
        }

        int row =0;
        int req=1;
        while(n!=0 || req>n ){

            if(n==0){

                return row;
            }


          else  if(req>n){
               return row;
            }

           n-=req;
           row++;
           req++;




        }

        
        return row;
    }
}