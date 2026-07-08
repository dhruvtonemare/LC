# 2260. Minimum Consecutive Cards to Pick Up
# https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/

class Solution {
    public int minimumCardPickup(int[] cards) {


        if(cards.length ==1 ){
            return -1;
        }

        HashMap<Integer,Integer>hm = new HashMap<>();

       int min = Integer.MAX_VALUE;

       for(int i=0 ; i<cards.length ;i++){

        int curr= cards[i];

        int d=0;

         if(hm.containsKey(curr)){
            d= Math.abs(i-hm.get(curr));
            min = Math.min(d,min);
            hm.put(curr,i);
         }

         else{
            hm.put(curr,i);
         }
       }

        if(min==Integer.MAX_VALUE){
            return -1;
        }

        return min+1;
        
    }
}