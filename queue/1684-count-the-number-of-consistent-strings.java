# 1684. Count the Number of Consistent Strings
# https://leetcode.com/problems/count-the-number-of-consistent-strings/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {


        Set<Character>s = new HashSet<>();

        for(int i=0 ;  i<allowed.length() ; i++){

            s.add(allowed.charAt(i));
        }

         int consistent=0;

        for(int i=0 ;  i<words.length ; i++){

            String x = words[i];
          
          for(int j=0 ;  j<x.length(); j++){

            if(!s.contains(x.charAt(j))){
                break;
            }

            else if(j == x.length()-1 && s.contains(x.charAt(j))){
                consistent++;
            }

            

          
        }



          
        }

        return consistent;



        
    }
}