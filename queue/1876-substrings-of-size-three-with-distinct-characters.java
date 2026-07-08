# 1876. Substrings of Size Three with Distinct Characters
# https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

class Solution {
    public int countGoodSubstrings(String s) {

        if(s.length() ==2 || s.length()==1){
            return 0;
        }

       int good =0;

       for(int i=0 ; i<=s.length()-3 ;i++){

        if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) &&s.charAt(i)!=s.charAt(i+2) ){
            
            good++;
        }
       }
        

    return good;
        
    }
}