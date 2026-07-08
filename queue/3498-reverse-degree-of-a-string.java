# 3498. Reverse Degree of a String
# https://leetcode.com/problems/reverse-degree-of-a-string/

class Solution {
    public int reverseDegree(String s) {

        int total=0;

        for(int i=0 ; i<s.length() ; i++){

            int curr=0;

            int pos=s.charAt(i)-'a';

            curr = 26 - pos;


            int res= (i+1)*curr;

            total+=res;
        }

        return total;
        
    }
}