# 1816. Truncate Sentence
# https://leetcode.com/problems/truncate-sentence/

class Solution {
    public String truncateSentence(String s, int k) {

        int space=0;

        StringBuilder sb= new StringBuilder("");

        int i=0 ;

        while(i<s.length() && space <k){

            if(s.charAt(i)==' '){
                sb.append(" ");
                space++;
                i++;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }

        }

        if(sb.charAt(sb.length()-1) == ' '){
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
        
    }
}