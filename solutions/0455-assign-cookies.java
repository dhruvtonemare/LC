# 455. Assign Cookies
# https://leetcode.com/problems/assign-cookies/

class Solution {
    public int findContentChildren(int[] g, int[] s) {

       int cookie = 0; 
       int child=0;

       Arrays.sort(g);
                  Arrays.sort(s);

       while(child<g.length && cookie<s.length ){
              
              if(s[cookie]>=g[child]){
                child ++;
              }
              cookie ++;


       }

        return child;
    }
}