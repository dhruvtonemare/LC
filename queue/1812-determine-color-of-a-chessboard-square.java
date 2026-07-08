# 1812. Determine Color of a Chessboard Square
# https://leetcode.com/problems/determine-color-of-a-chessboard-square/

class Solution {
    public boolean squareIsWhite(String coordinates) {


        int x= coordinates.charAt(0)-'a';

        int y= Character.getNumericValue(coordinates.charAt(1));


        if((x%2==0 && y%2==0)  || (x%2!=0 && y%2!=0)){
            return true;
        }

        return false;

        


        
    }
}