# 696. Count Binary Substrings
# https://leetcode.com/problems/count-binary-substrings/

class Solution {
    public int countBinarySubstrings(String s) {

        int n= s.length();

        if(n==1){
            return 0;
        }

        int streak=1;
        int res,prev;
        res=prev=0;


        for(int i=1; i<n;i++){


            if(s.charAt(i)==s.charAt(i-1)){
                streak++;
            }

            else{
                prev=streak;
                streak=1;
            }

            if(streak<=prev){
                res++;
            }
            


        }

        


        return res;
    }
}