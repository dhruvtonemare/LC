# 2942. Find Words Containing Character
# https://leetcode.com/problems/find-words-containing-character/

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        

        List <Integer>  result = new ArrayList<>();
        

        for(int i =0; i<words.length ;i++){

            String m=words[i];

          

            for(int j=0 ; j<m.length();j++){

                char ch= m.charAt(j);

                if(ch==x){
                    result.add(i);
                    break;
                }



            }


        }


        return result;
    }
}