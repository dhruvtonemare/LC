# 832. Flipping an Image
# https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int row = image.length;
        int col=row;


        int result [][] = new int [row] [col];

        // flipping it horizontally first 

        
        for(int i=0; i<row ; i++){
            int pos=0;
            for(int j=col-1 ; j>=0 ; j--){
                int current = image[i][j];
               if(current== 0){
                 result[i][pos]=1;
               }
               else{
                result[i][pos]=0;
               }
                pos++;
            }
        }


        return result;
        
    }
}