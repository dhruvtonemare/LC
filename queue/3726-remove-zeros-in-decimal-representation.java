# 3726. Remove Zeros in Decimal Representation
# https://leetcode.com/problems/remove-zeros-in-decimal-representation/

class Solution {
    public long removeZeros(long n) {

       String x = String.valueOf(n);

       long ans=0;

       for(int i=0 ; i<x.length();i++){
        int curr = Character.getNumericValue(x.charAt(i));

        if(0!=curr){
            ans=(ans*10)+curr;
        }
       }

       return ans;
        
    }
}