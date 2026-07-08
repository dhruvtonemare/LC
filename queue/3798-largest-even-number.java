# 3798. Largest Even Number
# https://leetcode.com/problems/largest-even-number/

class Solution {
    public String largestEven(String s) {

        StringBuilder sb = new StringBuilder(s);

        for(int i =sb.length()-1; i>=0 ; i--){

            int n = sb.charAt(i) - '0';

            if(n%2 == 0){

                return sb.toString();
            }

            else{
                sb.deleteCharAt(sb.length()-1);
            }
        }

        return "";
        
    }
}