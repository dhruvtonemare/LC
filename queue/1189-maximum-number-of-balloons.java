# 1189. Maximum Number of Balloons
# https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {

        int count =0;


        HashMap<Character , Integer> h = new HashMap<>();


        for(int i =0 ; i<text.length();i++){

            if(h.containsKey(text.charAt(i))){
               h.put(text.charAt(i), h.get(text.charAt(i)) + 1);
            }
            else{
                h.put(text.charAt(i),1);
            }
        }

      int b= h.getOrDefault('b',0);
       int a= h.getOrDefault('a',0);
        int l= h.getOrDefault('l',0)/2;
         int o= h.getOrDefault('o',0)/2;
          int n= h.getOrDefault('n',0);





     count = Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

       
        

        

        return count;
        
    }
}