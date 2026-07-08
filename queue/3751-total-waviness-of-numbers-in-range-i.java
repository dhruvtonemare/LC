# 3751. Total Waviness of Numbers in Range I
# https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/

class Solution {
    public int totalWaviness(int num1, int num2) {

        int v=0;
        int pe=0;


        for(int i =num1 ; i<= num2 ; i++){

            String x = String.valueOf(i);
            
            if(x.length()>2){

                for(int j=1 ; j<x.length()-1 ; j++){

                    int p= Character.getNumericValue(x.charAt(j-1));
                    int c=Character.getNumericValue(x.charAt(j));
                    int f =Character.getNumericValue(x.charAt(j+1));

                    if(c>p && c>f){

                        pe++;

                    }

                    else if(c<p && c<f){
                        
                        v++;
                    }
                }
            }
        }


        return v+pe;
        
    }
}