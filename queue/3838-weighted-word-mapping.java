# 3838. Weighted Word Mapping
# https://leetcode.com/problems/weighted-word-mapping/

class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder("");

        char[] alphabetArray = {


            'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'
    
};

        for(int i=0 ; i<words.length ; i++){

            String x = words[i];

            int sum =0 ; 

            for(int j=0 ; j<x.length() ; j++){

                char ch = x.charAt(j);

                int val = ch-'a';

                sum+=weights[val];

  
        }


        System.out.println(sum);

        sb.append(alphabetArray[sum%26]);




        }


        return sb.toString();
        
    }
}