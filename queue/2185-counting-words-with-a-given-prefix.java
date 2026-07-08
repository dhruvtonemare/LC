# 2185. Counting Words With a Given Prefix
# https://leetcode.com/problems/counting-words-with-a-given-prefix/

class Solution {
    public int prefixCount(String[] words, String pref) {

        int count =0;

        for(int i=0 ;i<words.length ; i++){

            String s = words[i];

            if(s.length()<pref.length()){
                continue;
            }

            else {

                for(int j=0 ; j<pref.length() ;j++){

                    if(j== pref.length()-1 && pref.charAt(j)==s.charAt(j)){
                        count++;
                    }

                    else if( pref.charAt(j)!=s.charAt(j)){
                        break;
                    }
                }
            }
        }

        return count;
        
    }
}