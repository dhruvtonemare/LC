# 283. Move Zeroes
# https://leetcode.com/problems/move-zeroes/

import java .util.*;

class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;

        //  count total number of zeroes in the array
        int zeroes = 0;

        for(int i = 0; i< n ; i ++){

            if(nums[i]== 0 ){
                zeroes ++;
            }

            System.out.println(zeroes);


        }


        ArrayList <Integer> nnew = new ArrayList <>();
         // copy the array without zeroes 
        for(int i = 0 ; i< n; i++){

            if(nums[i]!= 0){
                nnew.add(nums[i]);
            }
        }

        // add those remaining zeroes afterwards

        for(int i = 0 ; i<= zeroes; i++){

            nnew.add(0);
        }



        // changing the orignal array now

        for(int i = 0 ; i< n; i++){

            nums[i]= nnew.get(i);
        }






    }
}