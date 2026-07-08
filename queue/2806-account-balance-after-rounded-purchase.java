# 2806. Account Balance After Rounded Purchase
# https://leetcode.com/problems/account-balance-after-rounded-purchase/

class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {

        if(purchaseAmount%10 ==0){
            return 100- purchaseAmount;
        }
        
       


        int l=(purchaseAmount/10)*10;
        int h=(l+10);

        int d1=purchaseAmount-l;
        int d2=h-purchaseAmount;

        

        if(d1<d2){
            return 100-l;
        }

      



        return 100-h;
        
    }
}