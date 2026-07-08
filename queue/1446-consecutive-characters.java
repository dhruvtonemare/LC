# 1446. Consecutive Characters
# https://leetcode.com/problems/consecutive-characters/

class Solution {
    public int maxPower(String s) {

        int max = Integer.MIN_VALUE;

        int prev=1;

        for(int i=0 ; i<s.length(); i++){

            char ch = s.charAt(i);

            if(i==0){
                prev=1;
            }

            else if(ch == s.charAt(i-1)){
                prev++;
            }

            else if(ch != s.charAt(i-1)){
                prev=1;
            }

            max = Math.max(prev,max);




            
        }

        return max;
        
    }
}