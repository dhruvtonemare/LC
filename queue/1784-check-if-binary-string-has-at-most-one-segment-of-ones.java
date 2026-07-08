# 1784. Check if Binary String Has at Most One Segment of Ones
# https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

class Solution {
    public boolean checkOnesSegment(String s) {

        int n= s.length();

       
        if(n==1  && s.charAt(0)=='1'){
            return true;
        }

        int count,segments;
        count = segments =0;

       

        // count the number of segments rather 



        for(int i=0 ;i <n-1 ; i++){

            

            if((s.charAt(i)=='1' && s.charAt(i+1)=='0') || (s.charAt(i)=='0' && s.charAt(i+1)=='1') ){
                segments++;
            }

        }

        if(segments == 1  || segments == 0 ){
            return true;
        }


        return false;

        
    }
}