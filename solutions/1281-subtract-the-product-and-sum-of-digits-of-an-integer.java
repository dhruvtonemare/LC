# 1281. Subtract the Product and Sum of Digits of an Integer
# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {

        int p=n;
        int s=n;


        int pro=1;

        int sum=0;

        while(p>0){
            int d= p%10;

            pro=(pro*1)*d;
            sum+=d;

            p/=10;
        }

        System.out.println(pro+" "+sum);

        return pro-sum;
        
    }
}