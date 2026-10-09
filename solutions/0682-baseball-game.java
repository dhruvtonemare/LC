# 682. Baseball Game
# https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] operations) {

        int n= operations.length;

        Stack <Integer>s = new Stack<>();

        for(int i = 0 ; i<n ; i++){


            if(isNumeric(operations[i])){

                int x = Integer.valueOf(operations[i]);
                s.add(x);
            }
            else if(!isNumeric(operations[i])){


                if("C".equals(operations[i])){
                    s.pop();
                }

                 if("D".equals(operations[i])){
                    
                    s.add(s.peek()*2);
                }

                if("+".equals(operations[i])){
                    
                   int second = s.pop();
                   int first= s.pop();
                   int third= second+first;
                   s.add(first);
                   s.add(second);
                   s.add(third);

                }




            }


            


        }


        if(s.isEmpty()){
            return 0;
        }

        else{
            int total=0;
            while(!s.isEmpty()){

                total+=s.pop();
            }

            return total;
        }
        
    }


    public static boolean isNumeric(String str) {
    if (str == null) { // Check for null input
        return false;
    }
    try {
        Double.parseDouble(str); // Try parsing as a Double
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}