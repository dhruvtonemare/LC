# 2525. Categorize Box According to Criteria
# https://leetcode.com/problems/categorize-box-according-to-criteria/

    class Solution {
        public String categorizeBox(int length, int width, int height, int mass) {

            boolean bulk = false;

            boolean heavy =false;

            long volume =(long) length * width * height;


            if( (volume >= Math.pow(10,9))  || (length >= 10000) || 
            (width >= 10000) || (height >= 10000) ){

                bulk =true;
            }

            if(mass>=100){
                heavy=true;
            }


        if(bulk && heavy ){

            return "Both";
        }

        if(bulk ==false && heavy ==false ){

            return "Neither";
        }


        if(bulk){
            return "Bulky";
        }

        return "Heavy";


            
        }
    }