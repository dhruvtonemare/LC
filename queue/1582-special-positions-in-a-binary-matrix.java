# 1582. Special Positions in a Binary Matrix
# https://leetcode.com/problems/special-positions-in-a-binary-matrix/

class Solution {
    public int numSpecial(int[][] mat) {

        Set<Integer>s=new HashSet<>();
        int ans=0;

        int m= mat.length;
        int n= mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m ;i++){
            for(int j=0 ; j<n ; j++){

                if(mat[i][j]==1){

                    row[i]++;
                    col[j]++;

                }


            }
        }



         for(int i=0; i<m ;i++){
            for(int j=0 ; j<n ; j++){

                if(mat[i][j]==1 && row[i]==1  &&  col[j] ==1 ){

                    ans++;

                }


            }
        }



        return ans;


        
    }
}