# 2383. Minimum Hours of Training to Win a Competition
# https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {

        int hours_energy=0;

        int hours_exp=0;

        //  first calculate to tal energy and then diffrence betwwen ours and all the players (wrong this is we will calculate here then extara hours)
        

         int n = energy.length;


        

        for(int i =0 ; i<n ; i++){

          if(initialEnergy<=energy[i]){
            //then train

           int required = (energy[i]+1)-initialEnergy;
           hours_energy+= required;
           initialEnergy+=required;
           initialEnergy-=energy[i];
           
          }

          else{

             initialEnergy-=energy[i];


          }

          


        }

        




           
          int curr_exp=initialExperience;
      for(int i =0 ; i<n ;i++){

        int exp_req=0;

        if(curr_exp <= experience[i] ){
            
            int required= (experience[i]+1)-curr_exp;

           hours_exp+=required;

             curr_exp+=required;





        }

        

            curr_exp+=experience[i];




        




      }
      
      









       return  hours_energy+hours_exp;
    }
}