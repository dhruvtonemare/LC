# 1184. Distance Between Bus Stops
# https://leetcode.com/problems/distance-between-bus-stops/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        // clock wise 

        

        int n= distance.length;

        int clock= 0;
        
        for(int i = start ; i!= destination ; i= (i+1)%n){
            clock+=distance[i];
        }

        int c_clock=0;

         for(int i = destination ; i!= start ; i= (i+1)%n){
            c_clock+=distance[i];
        }

        return Math.min(c_clock,clock);
        
    }
}