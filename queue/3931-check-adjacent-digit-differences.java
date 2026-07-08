# 3931. Check Adjacent Digit Differences
# https://leetcode.com/problems/check-adjacent-digit-differences/

class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {


        for(int i=1 ; i<s.length() ; i++){

            if(Math.abs(Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i-1)))>2){
                return false;
            }
        }

        return true;
        
    }
}