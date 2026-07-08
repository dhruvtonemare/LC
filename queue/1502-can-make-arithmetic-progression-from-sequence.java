# 1502. Can Make Arithmetic Progression From Sequence
# https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        if (arr.length == 2){
            return true;
        }

        int gap = Math.abs(arr[1]-arr[0]);

        for(int i=0 ;i<arr.length-1; i++){

            if(Math.abs(arr[i+1]-arr[i])!= gap){
                return false ;
            }

            
        }

        return true;
        
    }
}