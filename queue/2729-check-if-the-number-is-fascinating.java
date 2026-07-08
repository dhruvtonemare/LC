# 2729. Check if The Number is Fascinating
# https://leetcode.com/problems/check-if-the-number-is-fascinating/

class Solution {
    public boolean isFascinating(int n) {

        int a=n*2;
        int b= n*3;

        String x= String.valueOf(""+n+a+b);

        HashSet<Character>h  = new HashSet<>();

        for(int i=0 ; i<x.length();i++){
            char ch = x.charAt(i);

            if(ch =='0'  || h.contains(ch)){
                return false;
            }
            h.add(ch);
        }

        return true;
        
    }
}