# 73. Set Matrix Zeroes
# https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row_arr []= new int[rows];
        int cols_arr []= new int[cols];

        for(int i =0 ; i < rows; i ++){

            row_arr[i]=0;
        }

          for(int i =0 ; i < cols; i ++){

            cols_arr[i]=0;
        }

        for(int i = 0; i< rows; i++){
            for(int j = 0; j<matrix[i].length; j++){

                if(matrix[i][j]==0){

                    row_arr[i]=1;
                    cols_arr[j]=1;
                }
            }
        }

        for(int i = 0; i< rows; i++){
            for(int j = 0; j<matrix[i].length; j++){

              if(row_arr[i]==1  ||cols_arr[j]==1){

                matrix[i][j]=0;
              }
            }
        }



        

   

    }
}