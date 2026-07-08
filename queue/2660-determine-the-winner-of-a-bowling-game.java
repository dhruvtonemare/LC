# 2660. Determine the Winner of a Bowling Game
# https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/

class Solution {
    public int isWinner(int[] player1, int[] player2) {


        int p1=0;
        int p2=0;

        for(int i=0 ; i<player1.length; i++){

            if(i==1 && player1[i-1]==10){
                p1+=(2*player1[i]);
            }
            else if(i>=2 && (player1[i-1]==10 ||player1[i-2]==10)){
                p1+=(2*player1[i]);
            }

            else{
               p1+=(player1[i]);  
            }
        }

        for(int i=0 ; i<player2.length; i++){

            if(i==1 && player2[i-1]==10){
                p2+=(2*player2[i]);
            }
            else if(i>=2 && (player2[i-1]==10 ||player2[i-2]==10)){
                p2+=(2*player2[i]);
            }

            else{
               p2+=(player2[i]);  
            }
        }


        if(p1==p2){
            return 0;
        }

        else if(p1>p2){
            return 1;
        }

        return 2;
    }
}