# 2833. Furthest Point From Origin
# https://leetcode.com/problems/furthest-point-from-origin/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {



        char ch='_';

        int curr=0;

        int l =0;

        int r=0;

        for(int i=0 ; i<moves.length(); i++){
            if(moves.charAt(i)!='_'){
                ch=moves.charAt(i);
                
            }

            if(moves.charAt(i)=='L'){
                l++;
            }

            else if(moves.charAt(i)=='R'){
                r++;
            }


        }

        if(ch=='_'){
            return moves.length();
        }


        int action =0;

        if(l>=r){
            action=-1;
        }
        else{
            action=1;
        }


         for(int i=0 ; i<moves.length(); i++){
           
           if(moves.charAt(i)=='_'){
            
            curr+= action;
           }

           if(moves.charAt(i)=='L'){
            
            curr+= -1;
           }

           if(moves.charAt(i)=='R'){
            
            curr+= 1;
           }



        }




        

     

        return  Math.abs(curr-0);
        
    }
}