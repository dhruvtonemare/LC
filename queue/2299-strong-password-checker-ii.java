# 2299. Strong Password Checker II
# https://leetcode.com/problems/strong-password-checker-ii/

class Solution {
    public boolean strongPasswordCheckerII(String password) {

          if(password.length()<8){
            return false;
          }


          int d=0;

          int l =0;

          int u=0;

          int s=0;

          for(int i=0  ; i<password.length() ; i++){

            char ch = password.charAt(i);

            if(Character.isDigit(ch)){
                d++;
            }

             if((ch>='A' &&  ch<='Z')){
                u++;
            }

              if((ch>='a' &&  ch<='z')){
                l++;
            }

             if (ch == '!' || ch == '@' || ch == '#' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+' || ch =='$') {
    s++;
}

            if( i<password.length()-1 &&ch==password.charAt(i+1)){
                System.out.println("here");
                return false;

            }

            

          }
    System.out.println(s+" "+d+" "+l+" "+u);


      if(d>=1 && u>=1 && l>=1 && s>=1){
        return true;
      }

      return false;
        
    }
}