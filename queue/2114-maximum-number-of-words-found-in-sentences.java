# 2114. Maximum Number of Words Found in Sentences
# https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {

        int max= Integer.MIN_VALUE;

        for(int i=0 ; i<sentences.length; i++){

            String x =sentences[i];
            int space=0;

            for(int j=0 ; j<x.length() ; j++){

                 if (x.charAt(j) == ' ') { 
                     space++;
                 }


                int l= space+1;

                max = Math.max(l,max);
            }
        }

        return max;
        
    }
}