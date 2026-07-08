# 2347. Best Poker Hand
# https://leetcode.com/problems/best-poker-hand/

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        

        int suity=0;

        for(int i=1 ; i<suits.length ; i++){

            if(suits[i]==suits[i-1]){
                suity++;
            }

           
        }

        if(suity==4){
            return "Flush";
        }

        int [] arr = new int[13];

        for(int i=0 ; i<ranks.length ; i++){

            int curr = ranks[i]-1;

            arr[curr]+=1;

        }

        boolean  tri = false;

        boolean pai = false;

       for(int i=0 ; i<arr.length ; i++){

        if(arr[i]>=3){
            tri = true;
        }

        else if(arr[i]==2){
            pai= true;
        }

           

        }


        if(tri){
            return "Three of a Kind";
        }

        if(pai){

            return "Pair";
        }




        return  "High Card";

        
    }
}