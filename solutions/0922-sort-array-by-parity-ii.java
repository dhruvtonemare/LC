# 922. Sort Array By Parity II
# https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        

        int i=0 ;
       

        while(i<nums.length){
            
            int j=i+1;
            if((i%2 ==0  &&  nums[i]%2 ==0) || (i%2 !=0  &&  nums[i]%2 !=0) ){
                i++;
                continue;
            }

            else if((i%2 !=0  &&  nums[i]%2 ==0)){
                while(j<nums.length && nums[j]%2==0){
                    j++;
                }
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

             else if((i%2 ==0  &&  nums[i]%2 !=0)){
                while(j<nums.length && nums[j]%2!=0){
                    j++;
                }
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

         

         i++;
        }

       
       
        return nums;
    }
}