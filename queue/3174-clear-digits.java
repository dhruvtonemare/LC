# 3174. Clear Digits
# https://leetcode.com/problems/clear-digits/

class Solution {
    public String clearDigits(String s) {

       StringBuilder sb = new StringBuilder("");

       int close =-1;

        for(int i=0 ; i<s.length(); i++){

            if(s.charAt(i)<'a' || s.charAt(i)>'z'  && close > -1){
                System.out.println(sb.toString());
                sb.deleteCharAt(close);
            
                close--;
                

            }

          else  if(s.charAt(i)<'a' || s.charAt(i)>'z'  && close == -1){
                continue;
                
             }

             else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
                close=sb.length()-1;
             }


        }


        return sb.toString();
        
    }
}