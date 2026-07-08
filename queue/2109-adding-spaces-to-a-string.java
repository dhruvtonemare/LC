# 2109. Adding Spaces to a String
# https://leetcode.com/problems/adding-spaces-to-a-string/

class Solution {
    public String addSpaces(String s, int[] spaces) {


        int pos=0;
        

        StringBuilder sb = new StringBuilder ("");


        for(int i=0 ; i<s.length () ; i++){

            if( pos<spaces.length && i==spaces[pos]){
                sb.append(" ");
                sb.append(s.charAt(i));
                pos++;
            }

            else{
                sb.append(s.charAt(i));
            }
        }

                


        return sb.toString();
        
    }
}