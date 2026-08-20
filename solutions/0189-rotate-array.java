# 189. Rotate Array
# https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {


        int n = nums.length;
         if (n <= 1 || k % n == 0) return;
         k = k % n;
        int parts = n-k;


        int []newnums = new int[n];

        int i = 0;

        //taking   n-k parts first

        for(int j =parts ; j<n; j++){

            newnums[i]=nums[j];
            i++;

        }

        // taking  0 to  parts

           for(int j =0 ; j<parts; j++){

            newnums[i]=nums[j];
            i++;

        }


        for(int m =0 ; m<n; m++){

            nums[m]= newnums[m];
        }
        
    }
}