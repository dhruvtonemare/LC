# 1704. Determine if String Halves Are Alike
# https://leetcode.com/problems/determine-if-string-halves-are-alike/

class Solution {
    public boolean halvesAreAlike(String s) {

        int v1 = 0;
        int v2 =0;

        String vow= "aeiouAEIOU";

        for(int i=0 ; i<s.length()/2 ; i++){

            if(vow.indexOf(s.charAt(i))!=-1){
                v1++;
                
            }

            if(vow.indexOf(s.charAt(s.length()-1-i))!=-1){
                v2++;
                
            }
        }

        

        return v1==v2;
        
    }
}