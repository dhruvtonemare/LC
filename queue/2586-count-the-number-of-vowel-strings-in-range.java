# 2586. Count the Number of Vowel Strings in Range
# https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/

class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int vs=0;

        for(int i=left ; i<=right ; i++){

            String x = words[i];    
            if((x.charAt(0)=='a'||x.charAt(0)=='e'||x.charAt(0)=='i'||x.charAt(0)=='o'||x.charAt(0)=='u') 
               &&
               (x.charAt(x.length()-1)=='a'||x.charAt(x.length()-1)=='e'||x.charAt(x.length()-1)=='i'
               ||x.charAt(x.length()-1)=='o'||x.charAt(x.length()-1)=='u')    ){
                vs++;
               }    
            }
        

        return vs;
    }
}