# 1833. Maximum Ice Cream Bars
# https://leetcode.com/problems/maximum-ice-cream-bars/

class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int i=0;
        int count =0;

        while(i<costs.length &&coins>=costs[i]){

            coins-=costs[i];
            i++;

            count ++;

        }

        return count;
        
    }
}