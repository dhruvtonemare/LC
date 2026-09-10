# 383. Ransom Note
# https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

                HashMap<Character,Integer>hm = new HashMap<>();

                for(int i =0 ; i <ransomNote.length(); i++){

                    char ch = ransomNote.charAt(i);

                    if(hm.containsKey(ch)){
                        hm.put(ch,hm.get(ch)+1);
                    }
                    else{
                         hm.put(ch,1);
                    }
                }

                for(int i =0 ; i <magazine.length(); i++){

                    char ch = magazine.charAt(i);

                    if(hm.containsKey(ch) && hm.get(ch)==1){

                        hm.remove(ch);
                    
                      }

                      else if(hm.containsKey(ch)){
                        hm.put( ch,hm.get(ch)-1);
                      }

                     



                   
                }



       if(hm.isEmpty()) return true;

       return false;


        
    }
}