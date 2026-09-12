# 389. Find the Difference
# https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
       
        if(t.length()==1){
         char  ch = t.charAt(0);
           return ch;
        }

        char imposter=' ';

        HashMap <Character,Integer>hm = new HashMap<>();

    for(int i =0; i<s.length();i++){
       
       char ch = s.charAt(i);
       
       if(hm.containsKey(ch)){
        hm.put(ch,hm.get(ch)+1);
       }
       else{
        hm.put(ch,1);
       }

    }

    for(int i =0; i<t.length();i++){



        char ch = t.charAt(i);

      if(!hm.containsKey(ch) || hm.get(ch)==0){

        return ch;
         
      }

      hm.put(ch,hm.get(ch)-1);
    }


        return imposter ;
    }
}