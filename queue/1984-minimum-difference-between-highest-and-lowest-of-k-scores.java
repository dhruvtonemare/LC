# 1984. Minimum Difference Between Highest and Lowest of K Scores
# https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

class Solution {
    public int minimumDifference(int[] nums, int k) {


        Arrays.sort(nums);


        int n= nums.length;

        if(nums.length==1){

            return 0;
        }

        if(nums.length==2){

           return Math.abs(nums[0]-nums[1]);
        }

        int left =0 ;
       int  right =k-1;

       int min = Integer.MAX_VALUE;

       while(right<n){


        int current = nums[right]-nums[left];

        if(current<min){min=current;}


        left+=1;

        right+=1;




       }

       

        


          return min;

            



        
          }





      


        
    }
