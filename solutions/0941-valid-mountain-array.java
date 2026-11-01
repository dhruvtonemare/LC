# 941. Valid Mountain Array
# https://leetcode.com/problems/valid-mountain-array/

class Solution {
    public boolean validMountainArray(int[] arr) {

        int n= arr.length;


        boolean increase_phase = false;
        boolean decre_phase =false;

        int decrease_start=0;

        for(int i=0 ; i<n-1 ; i++){

            if(decre_phase){
                break;
            }
          else if(arr[i]== arr[i+1]){
                return false;
            }

            else if(arr[i]<arr[i+1]){
                increase_phase = true;
            }

          else  if(arr[i] > arr[i+1]){
                decre_phase =true;
                decrease_start=i+1;
                break;


                
             }




        }

        for(int i=decrease_start ; i<n-1 ; i++){

            if(arr[i]<arr[i+1] && increase_phase  ){

                return false;
            }

             else if(arr[i]== arr[i+1]){
                return false;
            }
        }


        return (increase_phase && decre_phase);


        
    }
}