# 2078. Two Furthest Houses With Different Colors
# https://leetcode.com/problems/two-furthest-houses-with-different-colors/

class Solution {
    public int maxDistance(int[] colors) {


        int max = Integer.MIN_VALUE;

        for(int i=0; i<colors.length-1; i++){
         
          for(int j=i+1; j<colors.length; j++){
            if(colors[i]!=colors[j]){
                max=Math.max(max,Math.abs(i-j));
            }    
        }  
        }


        
        return max;
    }
}