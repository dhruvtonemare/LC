# 3582. Generate Tag for Video Caption
# https://leetcode.com/problems/generate-tag-for-video-caption/

class Solution {
    public String generateTag(String caption) {
        

        int n= caption.length();

       

        StringBuilder sb = new StringBuilder("");
         if(n==1 && caption.charAt(0)==' '){
            sb.append("#");
                     return sb.toString();


        }

         sb.append("#");


         for(int i=0 ; i<n ;i++){

            if(sb.length()==100){break;}



            char ch= caption.charAt(i);

            if(sb.length() == 1 && ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){

                sb.append(Character.toLowerCase(ch));


            }

            else if(i>0 &&caption.charAt(i-1) == ' ' &&
                     ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){

                 sb.append(Character.toUpperCase(ch));


            }

             else if(caption.charAt(i)!= ' '&&
                     ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){

                 sb.append(Character.toLowerCase(ch));


            }


            



            // skip to append the spaces


            




         }


         return sb.toString();


        
    }
}