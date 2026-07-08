# 3210. Find the Encrypted String
# https://leetcode.com/problems/find-the-encrypted-string/

class Solution {
    public String getEncryptedString(String s, int k) {

        StringBuilder sb = new StringBuilder("");

        for(int i=0 ; i<s.length() ; i++){

            int pos= (i+k)%s.length();

            sb.append(s.charAt(pos));
        }


        return sb.toString();
        
    }
}