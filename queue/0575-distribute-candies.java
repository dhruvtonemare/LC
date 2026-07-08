# 575. Distribute Candies
# https://leetcode.com/problems/distribute-candies/

class Solution {
    public int distributeCandies(int[] candyType) {


        Set<Integer>s = new HashSet<>();

        for(int i =0 ; i<candyType.length ; i++){

            if(!s.contains(candyType[i])){
                s.add(candyType[i]);
            }
        }

        int type = s.size();

        int req = candyType.length/2;


        if(req==type ){
            return type;
        }

        if(req > type ){

            return type;
        }

        return req;
        
    }
}