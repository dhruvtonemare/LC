# 3794. Reverse String Prefix
# https://leetcode.com/problems/reverse-string-prefix/

class Solution {
    public String reversePrefix(String s, int k) {
        

        StringBuilder sb = new StringBuilder(s);


        if(k==1 ){
            return s;
        }

       

        
           for(int i=0 ; i<k/2; i++){
             char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(k-1-i));
            sb.setCharAt(k-i-1, temp);
           }
           
        

        return sb.toString();
    }
}