# 3274. Check if Two Chessboard Squares Have the Same Color
# https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/

class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        //color of 1 

        int x_1=Character.getNumericValue(coordinate1.charAt(0))-'a'+1;
        int y_1=Character.getNumericValue(coordinate1.charAt(1));

        boolean col_1=false;

        if(x_1 %2 ==0  && y_1 %2 ==0){

            col_1=false;

        }

        else if(x_1 %2 ==0 && y_1 %2 !=0){
            col_1=true;
        }

        else if(x_1 %2 !=0 && y_1 %2 ==0){
            col_1=true;
        }
          else if(x_1 %2 !=0 && y_1 %2 !=0){
            col_1=false;
        }


        //color of 2 

        int x_2=Character.getNumericValue(coordinate2.charAt(0))-'a'+1;
        int y_2=Character.getNumericValue(coordinate2.charAt(1));

        boolean col_2=false;

        if(x_2 %2 ==0  && y_2 %2 ==0){

            col_2=false;

        }

        else if(x_2 %2 ==0 && y_2 %2 !=0){
            col_2=true;
        }

        else if(x_2 %2 !=0 && y_2 %2 ==0){
            col_2=true;
        }
          else if(x_2 %2 !=0 && y_2 %2 !=0){
            col_2=false;
        }



        
       return col_1 == col_2 ; 
    }
}