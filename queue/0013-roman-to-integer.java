# 13. Roman to Integer
# https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {

        int num =0;

        for(int i=0; i<s.length();i++){

        if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                num += 4;
                i++; // Skip the next character
            } else if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                num += 9;
                i++; // Skip the next character
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                num += 40;
                i++; // Skip the next character
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                num += 90;
                i++; // Skip the next character
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                num += 400;
                i++; // Skip the next character
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                num += 900;
                i++; // Skip the next character
            }
            // Handle individual characters
            else if (s.charAt(i) == 'I') {
                num += 1;
            } else if (s.charAt(i) == 'V') {
                num += 5;
            } else if (s.charAt(i) == 'X') {
                num += 10;
            } else if (s.charAt(i) == 'L') {
                num += 50;
            } else if (s.charAt(i) == 'C') {
                num += 100;
            } else if (s.charAt(i) == 'D') {
                num += 500;
            } else if (s.charAt(i) == 'M') {
                num += 1000;
            }
        }
        return num;
        
    }
}