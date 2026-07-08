# 2651. Calculate Delayed Arrival Time
# https://leetcode.com/problems/calculate-delayed-arrival-time/

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        if((arrivalTime+delayedTime) <24){
            return  arrivalTime+delayedTime ;
        }
        
       
        
        
        

        
            return  (arrivalTime+delayedTime)%24 ;
        
      
       
        
    }
}