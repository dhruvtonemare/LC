# 821. Shortest Distance to a Character
# https://leetcode.com/problems/shortest-distance-to-a-character/

class Solution {
    public int[] shortestToChar(String s, char c) {


        int [] result = new int[s.length()];

        

    // left pass 

    int n = s.length();
    int pos=-n;

    for (int i =0 ; i< s.length();i++){


        char ch = s.charAt(i);


        if(ch == c){
            result [i]=0;
            pos=i;
        }

        else{

            result [i]= Math.abs(pos-i);


        }

        
     }



      for (int i = n-1 ; i>=0;i--){


        char ch = s.charAt(i);


        if(ch == c){
            result [i]=0;
            pos=i;
        }

        else{

            result [i]= Math.abs(Math.min(result[i],pos-i));


        }

        
     }






    return result;
        
    }
}