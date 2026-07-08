# 3754. Concatenate Non-Zero Digits and Multiply by Sum I
# https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/

class Solution {
    public long sumAndMultiply(int n) {

        String x = String.valueOf(n);

        StringBuilder sb = new StringBuilder("");
        int sum =0;

        for(int i=0; i<x.length() ; i++){

            if(x.charAt(i)!='0'){

                sum+=Character.getNumericValue(x.charAt(i));
                sb.append(x.charAt(i));
            }
        }


        long num = sb.length() == 0 ? 0 : Long.valueOf(sb.toString());

       
        return num*sum;

        

        
    }
}