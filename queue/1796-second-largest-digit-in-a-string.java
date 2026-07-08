# 1796. Second Largest Digit in a String
# https://leetcode.com/problems/second-largest-digit-in-a-string/

class Solution {
    public int secondHighest(String ss) {

        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i=0 ; i<ss.length() ; i++){

            int ch = Character.getNumericValue(ss.charAt(i));

            if(ch>=0 &&ch<=9){

                if(ch>f){
                    s=f;
                    f=ch;
                }
                else if(f != ch && ch>s){
                    s=ch;
                }
            }
        }

        if (s==Integer.MIN_VALUE) return -1;

        return s;
        
    }
}