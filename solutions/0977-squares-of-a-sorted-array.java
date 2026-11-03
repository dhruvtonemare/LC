# 977. Squares of a Sorted Array
# https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n= nums.length;

        int [] result = new int[n];

        int i=n-1;

        int l= 0;
        int h= nums.length-1;

        while(l<=h){


            int sq1= Math.abs(nums[l]*nums[l]);
            int sq2= Math.abs(nums[h]*nums[h]);

            if(sq1>=sq2){

                result[i]=sq1;
                l++;
                i--;
            }
            else{

                 result[i]=sq2;
                h--;
                i--;

            }

            
        }


        return result;



        



    }
}