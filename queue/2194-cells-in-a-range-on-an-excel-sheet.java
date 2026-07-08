# 2194. Cells in a Range on an Excel Sheet
# https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/

class Solution {
    public List<String> cellsInRange(String s) {


        List<String>res= new ArrayList<>();


        char ch = s.charAt(3);

        int end = Character.getNumericValue(s.charAt(4));




       char c= s.charAt(0);

       int start = Character.getNumericValue(s.charAt(1));

       int ini = start;


       while(c<=ch ){

        while(start<=end){

        res.add(c+String.valueOf(start));
        start++;
        }

        start =ini;
        c++;


       }


       return res;


        
    }
}