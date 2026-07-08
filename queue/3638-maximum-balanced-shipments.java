# 3638. Maximum Balanced Shipments
# https://leetcode.com/problems/maximum-balanced-shipments/

class Solution {
    public int maxBalancedShipments(int[] weight) {
        

        if(weight.length==2  && weight[0]<weight[1]){

            return 0;
        }


        int total=0;

        int i=0;

        int curr =0;

        while(i<weight.length-1){

            

            if(weight[i]>weight[i+1]){
                total++;
                i++;
            }


            i++;
        }
        

        return total;
    }
}