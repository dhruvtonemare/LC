# 1528. Shuffle String
# https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder sb= new StringBuilder("");

        for(int i=0 ; i<s.length(); i++){
            sb.append("-");
        }

         for(int i=0 ; i<indices.length; i++){
            sb.setCharAt(indices[i],s.charAt(i));
        }

      

      return sb.toString();
        
    }
}