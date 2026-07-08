# 2960. Count Tested Devices After Test Operations
# https://leetcode.com/problems/count-tested-devices-after-test-operations/

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {

        int tested =0;

        for(int i=0  ; i<batteryPercentages.length ; i++){
            if(batteryPercentages[i]>0){
                tested++;

                for(int j=0 ; j<batteryPercentages.length ; j++){
                    batteryPercentages[j]-=1;
                }
            }
        }  
        return tested;      
    }
}