# 1103. Distribute Candies to People
# https://leetcode.com/problems/distribute-candies-to-people/

class Solution {
    public int[] distributeCandies(int candies, int num_people) {


        int [] people = new int [num_people];

        int required =0;

        int i=0;

        while(candies>0){

            required++;


            if(candies<required){

                people[i]+=candies;
                break;

            }

            people[i]+=required;
            


            




            

            if(i==num_people-1){
                i=0;
            }
            else{
                i++;
            }





            
           candies-=required;
           
        }


        return people;
        
    }
}