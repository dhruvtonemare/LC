# 2410. Maximum Matching of Players With Trainers
# https://leetcode.com/problems/maximum-matching-of-players-with-trainers/

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {


        if(players.length ==1  && trainers.length ==1 && trainers[0] >= players[0]){

            return 1;
        }

        Arrays.sort(players);
        Arrays.sort(trainers);

        int i=0 ;
        int j=0;

        int tot=0;

        while(i<players.length && j<trainers.length){

            if(players[i]<=trainers[j]){
                tot++;
                i++;
                j++;
            }

            else if(players[i]>trainers[i]){
                j++;
            }






        }

        return tot;

        
    }
}