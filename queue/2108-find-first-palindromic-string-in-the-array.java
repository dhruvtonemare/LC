# 2108. Find First Palindromic String in the Array
# https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

class Solution {
    public String firstPalindrome(String[] words) {


        int i =0 ; 

        int n = words.length;

       

        while(i<n){

            String s = words[i];
            int x = s.length();
             boolean brak = false;

            for(int j =0 ; j<(x/2);j++){
                if(s.charAt(j)!=s.charAt(x-j-1)){
                    brak = true ;
                    break;
                }
            }
            
            if(!brak){
               return s;
            }
            

            i++;
            
        }


        return "";
        
    }
}