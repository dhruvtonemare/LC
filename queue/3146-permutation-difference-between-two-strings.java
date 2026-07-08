# 3146. Permutation Difference between Two Strings
# https://leetcode.com/problems/permutation-difference-between-two-strings/

class Solution {
    public int findPermutationDifference(String s, String t) {

        int diffrence =0 ;

        HashMap <Character , Integer > hm = new HashMap<>();

        for(int i=0 ; i<s.length(); i++){

            hm.put(s.charAt(i),i);


            
        }  

        for(int i=0 ; i<s.length(); i++){

           char ch =  t.charAt(i);

           diffrence+=  Math.abs(hm.get(ch)-i);


            
        }

        return diffrence ;


    }
}