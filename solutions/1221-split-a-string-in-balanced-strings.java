# 1221. Split a String in Balanced Strings
# https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {


        int count =0;

        int balanced=0;

        for(int i=0 ; i<s.length(); i++){

            if(s.charAt(i)=='L'){
                balanced++;
            }
            else{
                balanced --;
            }

            if(balanced==0){
                count ++;
            }
        }


        return count ;
        
    }
}