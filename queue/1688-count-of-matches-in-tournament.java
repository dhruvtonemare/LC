# 1688. Count of Matches in Tournament
# https://leetcode.com/problems/count-of-matches-in-tournament/

class Solution {
    public int numberOfMatches(int n) {

        int matches =0;

        while(n>=2){

            if(n%2 ==0){
                n/=2;
                matches+=n;
            }
            else{

               n-=1;
               n/=2;
               matches+=n+1;

            }
        }


        return matches;
        
    }
}