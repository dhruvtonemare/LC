# 345. Reverse Vowels of a String
# https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {


        int n= s.length();

        if(n==1){

            return s;
        }




        StringBuilder sb= new StringBuilder(s);



        int left = 0 ;

        int right = n-1;


         while (left < right){


            char ch1= sb.charAt(left);
            char ch2= sb.charAt(right);


            if(isVowel(ch1)  &&  isVowel(ch2) ){


                char temp = sb.charAt(left);
sb.setCharAt(left, sb.charAt(right));
sb.setCharAt(right, temp);

left ++;  right --;




            }
        else if(isVowel(ch1)){


                right --;
            }


              else if(isVowel(ch2)){


                left++;
            }


            

          else{

            right --;
            left ++;
          }
           





         }



         return sb.toString();

        
        



    }


    boolean isVowel(  char c){

        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}