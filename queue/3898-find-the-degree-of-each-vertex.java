# 3898. Find the Degree of Each Vertex
# https://leetcode.com/problems/find-the-degree-of-each-vertex/

class Solution {
    public int[] findDegrees(int[][] matrix) {


        if(matrix.length ==1 && matrix[0].length ==1 ){

            int [] res= new int [1];

            res[0]=0;

            return res;
        }

        int [] res= new int[matrix.length];
        int pos=0;

        for(int i=0 ; i<matrix.length ;i++){

            int curr=0;

            for(int j=0 ; j<matrix[0].length ; j++){

                if(matrix[i][j] ==1){
                    curr++;
                }
            }

            res[pos]=curr;
            pos++;
        }   

        return res;     
    }
}