# 3959. Check Good Integer
# https://leetcode.com/problems/check-good-integer/

class Solution {
    public boolean checkGoodInteger(int n) {

        int squareSum =0;
        int digitSum =0;

        
        while(n>0){

            int d = n%10;

            digitSum+=d;
            squareSum+=(d*d);

            n/=10;

        }


        return squareSum-digitSum>=50;
        
    }
}