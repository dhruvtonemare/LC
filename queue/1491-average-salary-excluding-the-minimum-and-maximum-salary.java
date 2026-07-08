# 1491. Average Salary Excluding the Minimum and Maximum Salary
# https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

class Solution {
    public double average(int[] salary) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum =0;

        for(int i=0 ; i<salary.length ; i++){

            sum+=salary[i];

           if(salary[i]<min){
            min= salary[i];
           }

            if(salary[i]>max){
            max=salary[i];
           }
        }

        sum-=min;
        sum-=max;

       return (double) sum/(salary.length-2);

        

        
        
    }
}