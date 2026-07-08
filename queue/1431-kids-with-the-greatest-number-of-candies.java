# 1431. Kids With the Greatest Number of Candies
# https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean>result = new ArrayList<>();

        int max =0;

        for(int i=0 ; i<candies.length ; i++){

            max = Math.max(candies[i], max);


        }


         for(int i=0 ; i<candies.length ; i++){

            if(candies[i]+extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false); 
            }


        }


        return result;


        
    }
}