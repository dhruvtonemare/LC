# 605. Can Place Flowers
# https://leetcode.com/problems/can-place-flowers/

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0){return true;}
        

        int x = flowerbed.length;

        if(x==1 && n==1  && flowerbed[0]==0){
            return true;
        }

        for(int i=0 ; i<x ; i++){

            if(n==0){
                return true;
            }

            if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                n--;
                                flowerbed[i]=1;

            }
            
            else if(i==x-1 && flowerbed[i]==0 && flowerbed[i-1]==0){
                n--;
                                flowerbed[i]=1;


            }
            

            else if(i!=0 && i!=x-1 &&flowerbed[i-1]==0  &&  flowerbed[i+1]==0  && flowerbed[i]==0 ){


                n--;
                flowerbed[i]=1;
            }




        }

        if(n==0){return true;}

        return false;
        
    }
}