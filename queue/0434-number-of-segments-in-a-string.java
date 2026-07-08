# 434. Number of Segments in a String
# https://leetcode.com/problems/number-of-segments-in-a-string/

class Solution {
    public int countSegments(String s) {

        int n= s.length();
        int count =0;

        for(int i=0; i<n ; i++){

            if(s.charAt(i)!=' '  &&   (i == 0 || s.charAt(i - 1) == ' ')){
                count ++;
            }

            
        }


        return count;
        
    }
}