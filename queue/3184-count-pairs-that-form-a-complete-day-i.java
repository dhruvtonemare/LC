# 3184. Count Pairs That Form a Complete Day I
# https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/

class Solution {
    public int countCompleteDayPairs(int[] hours) {

        int total =0;

        for(int i=0 ; i<hours.length-1 ; i++){
            
             for(int j=i+1 ; j<hours.length ; j++){
             
             int curr= hours[i]+hours[j];

             if(curr%24==0  ){
                
                total++;
             }
            
        }
            
        }

        return total++;
        
    }
}