# 3541. Find Most Frequent Vowel and Consonant
# https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/

class Solution {
    public int maxFreqSum(String s) {
        
        int [] freq = new int[26];

        for(int i=0 ; i <s.length(); i++ ){

            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        int v=0; int c =0;

        for(int i=0; i<freq.length; i++){

            char ch = (char)(i + 'a');

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v = Math.max(v, freq[i]);
            } else {
                c = Math.max(c, freq[i]);
            }
            

        }

        return c+v;
    }
}