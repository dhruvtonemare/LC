# 2716. Minimize String Length
# https://leetcode.com/problems/minimize-string-length/

class Solution {
    public int minimizedStringLength(String s) {

       Set <Character> x = new  HashSet<>();

       for(int i=0;i<s.length();i++){

        x.add(s.charAt(i));
       }

       return x.size();
        
    }
}