# 1732. Find the Highest Altitude
# https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;

        int max = 0;

         int current=0;
        for(int i =0 ; i<n ;i++){

            

            if(i==0){

                current=current+gain[i];

            }

            else{

                current+= gain[i];
            }

            
             if(current >max){
                max= current;
             }

        }

       return max;
        
    }
}