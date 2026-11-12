# 1109. Corporate Flight Bookings
# https://leetcode.com/problems/corporate-flight-bookings/

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {


        int [] res = new int[n];

        for(int i=0 ; i<bookings.length ; i++){

            int start = bookings[i][0]-1;
            int end = bookings[i][1];
            int seat = bookings[i][2];

            for(int j= start ; j<end ; j++){

                res[j]+=seat;
            }

        }


        return res;
        
    }
}