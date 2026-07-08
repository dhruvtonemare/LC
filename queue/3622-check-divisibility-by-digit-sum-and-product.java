# 3622. Check Divisibility by Digit Sum and Product
# https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;

        int pro=1;

        int x = n;

        while(x>0){

            sum+= (x%10);
            pro *=  (x%10);

            x/=10;
        }

        
        return n%(pro+sum)==0;
        
    }
}