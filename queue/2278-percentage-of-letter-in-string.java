# 2278. Percentage of Letter in String
# https://leetcode.com/problems/percentage-of-letter-in-string/

class Solution {
    public int percentageLetter(String s, char letter) {

        int percent=0;

        int freq=0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==letter){
                freq++;
            }
        }

        if(freq==0){
            return 0;
        }
        System.out.println(freq);

        return (freq * 100) / s.length();

        
        
    }
}