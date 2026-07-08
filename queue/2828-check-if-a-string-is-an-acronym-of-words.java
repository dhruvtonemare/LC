# 2828. Check if a String Is an Acronym of Words
# https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/

class Solution {
    public boolean isAcronym(List<String> words, String s) {

        StringBuilder sb = new StringBuilder("");


        for(int i=0 ; i<words.size() ;i++){

            String x = words.get(i);

            sb.append(x.charAt(0));
        }

        return s.equals(sb.toString());
        
    }
}