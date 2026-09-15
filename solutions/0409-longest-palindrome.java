# 409. Longest Palindrome
# https://leetcode.com/problems/longest-palindrome/

class Solution {
    public int longestPalindrome(String s) {


     int odd =0;

    Map<Character, Integer> map = new HashMap<>();

    for(int i =0 ; i<s.length() ; i++){
         char ch = s.charAt(i);

         map.put(ch, map.getOrDefault(ch, 0) + 1);

       if(map.get(ch) % 2 ==1){

          odd ++;
       }

       else{

        odd --;
       }


    } 

    if(odd>1)return s.length() - (odd-1);
    return s.length();
    }
}