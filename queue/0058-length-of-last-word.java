# 58. Length of Last Word
# https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {

        String trimmed = s.replaceAll("\\s+$","");


        int  count =0;

        for(int i = trimmed.length()-1;i>=0;i--){

            if(trimmed.charAt(i) != ' '){
                count++;
            }
            else{
                return count;
            }
        

        }
         return count ;
        
     }
}