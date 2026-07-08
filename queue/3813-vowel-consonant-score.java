# 3813. Vowel-Consonant Score
# https://leetcode.com/problems/vowel-consonant-score/

class Solution {
    public int vowelConsonantScore(String s) {

        int vowel=0;
        int constant =0;

        for(int i=0 ; i<s.length(); i++){

            char ch = s.charAt(i);

            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                vowel ++;
            }

            else if (ch == 'b' ||ch == 'c' ||ch == 'd' ||ch == 'f' ||ch == 'g'|| 
                    ch == 'h' ||ch == 'j' ||ch == 'k' ||ch == 'l' ||ch == 'm'||
                    ch == 'n' ||ch == 'p' ||ch == 'q' ||ch == 'r' ||ch == 's'||
                     ch == 't' ||ch == 'v' ||ch == 'w' ||ch == 'x' ||ch == 'y'||ch == 'z'){
                constant ++;
            }

        }

        if(constant==0){
            return 0;
        }

        return Math.abs(vowel/constant);
        
    }
}