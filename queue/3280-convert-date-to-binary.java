# 3280. Convert Date to Binary
# https://leetcode.com/problems/convert-date-to-binary/

class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder("");
        int x = 0;

        for (int i = 0; i < date.length(); i++) {
            char ch = date.charAt(i);

           
            if (ch != '-') {
                int c = Character.getNumericValue(ch);
                x = (x * 10) + c;
            }

            
            if (ch == '-' || i == date.length() - 1) {
                StringBuilder binaryChunk = new StringBuilder();
                
                while (x != 0) {
                    int d = x % 2;
                  
                    binaryChunk.insert(0, d); 
                    x /= 2;
                }
                
                sb.append(binaryChunk);

              
                if (i != date.length() - 1) {
                    sb.append("-");
                }

                x = 0; 
            }
        }

        return sb.toString();
    }
}