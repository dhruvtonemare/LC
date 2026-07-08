# 3516. Find Closest Person
# https://leetcode.com/problems/find-closest-person/

class Solution {
    public int findClosest(int x, int y, int z) {

        int o= Math.abs(x-z);

        int s= Math.abs(y-z);

        if(s>o){
            return 1;
        }
        else if(o>s){
            return 2;
        }

        return 0;
        
    }
}