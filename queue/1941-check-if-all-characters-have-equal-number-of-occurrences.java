# 1941. Check if All Characters Have Equal Number of Occurrences
# https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/

class Solution {
    public boolean areOccurrencesEqual(String s) {

        if(s.length()==1){
            return true;
        }

        HashMap<Character, Integer>hm = new HashMap<>();

        for(int i =0 ; i<s.length () ; i++){

            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }

            else{
                 hm.put(s.charAt(i),1);

            }
        }

        int freq= hm.get(s.charAt(0));

        for(int i =1 ; i<s.length () ; i++){


            if(freq!=hm.get(s.charAt(i))){

                return false;
            }


 

            
          
        }


        return true;
        
    }
}