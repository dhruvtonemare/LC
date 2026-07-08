# 2255. Count Prefixes of a Given String
# https://leetcode.com/problems/count-prefixes-of-a-given-string/

class Solution {
    public int countPrefixes(String[] words, String s) {

        int count =0;

        for(int i=0; i<words.length ; i++){
            String x = words[i];

            for(int j=0 ; j<x.length(); j++){

                if(x.length()>s.length()){
                    break;
                }

               else if(j==x.length()-1 &&(x.charAt(j)==s.charAt(j))){
                    System.out.println(x);
                    count++;
                    break;
                }
                else if(x.charAt(j)!=s.charAt(j)){
                    break;
                }
            }

        }

        return count;
        
    }
}