# 3074. Apple Redistribution into Boxes
# https://leetcode.com/problems/apple-redistribution-into-boxes/

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int total =0;

        for(int i=0 ; i<apple.length; i++){
            total+=apple[i];
        }

        Arrays.sort(capacity);

        int i = capacity.length-1;
        int box=0;

        while( i>=0&&total>=1){
            total-=capacity[i];
            box++;
            i--;
        }
        
        System.out.println(total);
        return box;
        
    }
}