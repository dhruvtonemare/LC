# 3536. Maximum Product of Two Digits
# https://leetcode.com/problems/maximum-product-of-two-digits/

class Solution {
    public int maxProduct(int n) {

        int fs=Integer.MIN_VALUE;

        int ss=Integer.MIN_VALUE;

        while(n>0){
            int d= n%10;

            if(fs<=d){
              ss=fs;
              fs=d;

            }

            else if(ss<d){
                ss=d;
            }
            n/=10;
        }

        return fs*ss;
        
    }
}