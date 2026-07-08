# 1200. Minimum Absolute Difference
# https://leetcode.com/problems/minimum-absolute-difference/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);


         List<List<Integer>> result = new ArrayList<>();


          int n = arr.length;

         if(n==2){

                                List<Integer> r = new ArrayList<>();

           

           r.add(arr[0]);
           r.add(arr[1]);

           result.add(r);

           return result;



         }


        

        //  first find the minimum absolute diffrence 


        int min = Integer.MAX_VALUE;

        int left=0 ;
        int right = left+1;


       

        while(right<n){
            

            int current = Math.abs(arr[right]-arr[left]);

            if(current<min){
                min= current;
            }

            right++;

            left++;


        }


         left=0 ;
         right = left+1;



         while(right<n){

                                List<Integer> r = new ArrayList<>();


            if(Math.abs(arr[right]-arr[left])==  min  ){

                r.add(arr[left]);
                r.add(arr[right]);

                result.add(r);

                left++;
                right++;


            }

            else {


                 left++;
                right++;


            }
            

            
  


            


        }
        





        
      return result ;

        
    }
}