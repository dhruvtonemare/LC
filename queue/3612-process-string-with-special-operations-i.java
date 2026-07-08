# 3612. Process String with Special Operations I
# https://leetcode.com/problems/process-string-with-special-operations-i/

class Solution {
    public String processStr(String s) {
        int n= s.length();

        StringBuilder sb = new StringBuilder("");

        for(int i =0 ; i<n ; i++){

            char ch = s.charAt(i);

            if(ch=='%'){
                sb.reverse();
            }

           else if(ch == '#' ){
                String x = sb.toString();
                sb.append(x);
            }

            else if(i!=0 && ch=='*'  && sb.length()>=1){
                sb.deleteCharAt(sb.length()-1);
            }

            else if(ch>='a' && ch<='z'){
                sb.append(ch);
            }

        }



        return sb.toString();
        
    }
}