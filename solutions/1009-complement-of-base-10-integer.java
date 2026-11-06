# 1009. Complement of Base 10 Integer
# https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int n) {

        if(n==0)return 1;

        StringBuilder sb = new StringBuilder("");

        while(n>0){
            sb.append(n%2);
            n/=2;
        }

        int result=0;
        int pow=1;

        for(int i =0 ; i<sb.length(); i++){

            if(sb.charAt(i)=='0'){

                result+=pow;

            }
            pow*=2;
        }


       return result; 
    }
}