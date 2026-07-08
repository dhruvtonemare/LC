# 3847. Find the Score Difference in a Game
# https://leetcode.com/problems/find-the-score-difference-in-a-game/

class Solution {
    public int scoreDifference(int[] nums) {

        int p1=0;
        int p2 =0;

        int n= nums.length;

        int i=0;

        boolean val = true;

        while(i<n){

            int current = nums[i];

            

            if(current  % 2 !=0){
                val=!val;
            }

           if ((i + 1) % 6 == 0) {
                val=!val;
            }



            if(val){
                p1+=current;
            }
            else{
                p2+=current;
            }

            i++;

           

            



            
        }


        

     return p1-p2;
        
    }

    
}