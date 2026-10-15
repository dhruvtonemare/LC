# 744. Find Smallest Letter Greater Than Target
# https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {


        int t=(int)target;


        for(int i=0 ;i<letters.length;i++){

            int x =(int) letters[i];

            if(x>t){
                return letters[i];
            }
        }





        return letters[0];
        
    }
}