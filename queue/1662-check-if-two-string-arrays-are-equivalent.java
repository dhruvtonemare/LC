# 1662. Check If Two String Arrays are Equivalent
# https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder x= new StringBuilder("");
        StringBuilder y= new StringBuilder("");


        for(int i=0 ; i<word1.length ; i++){

            x.append(word1[i]);
        }

                for(int i=0 ; i<word2.length ; i++){

            y.append(word2[i]);
        }




        return x.toString().equals(y.toString());




        
    }
}