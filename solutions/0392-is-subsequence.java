# 392. Is Subsequence
# https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {


        boolean meet = false;

        int n= s.length();
        int m= t.length();

        int l=0;

        int r=0;

        if(n==0){
            return true;
        }

        while(r<m){

            if(s.charAt(l)==t.charAt(r)){

                if(l==n-1){
                    meet=true;
                    return meet;
                }
                else{
                    l++;
                r++;
                }
                
            }

            else {
                r++;
            }
        }

        return meet;
        
    }
}