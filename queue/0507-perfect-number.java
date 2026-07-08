# 507. Perfect Number
# https://leetcode.com/problems/perfect-number/

class Solution {
    public boolean checkPerfectNumber(int num) {

        int total=0;

        for(int i=1 ; i< num ;i++){

            if(num%i ==0){
                total+=i;
            }
        }

        System.out.println(total);

        return(total ==num);
        
    }
}