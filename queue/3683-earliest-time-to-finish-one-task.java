# 3683. Earliest Time to Finish One Task
# https://leetcode.com/problems/earliest-time-to-finish-one-task/

class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;

        int row = tasks.length;
        int col= tasks[0].length;

        for(int i=0 ; i<row ; i++){
            int curr=tasks[i][0]+tasks[i][1];
            min= Math.min(curr,min);
        }

        return min;
    }
}