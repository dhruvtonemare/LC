# 2287. Rearrange Characters to Make Target String
# https://leetcode.com/problems/rearrange-characters-to-make-target-string/

class Solution {
    public int rearrangeCharacters(String s, String target) {

        HashMap<Character,Integer>hm = new HashMap<>();

        int n= s.length();
        int m= target.length();

       

        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }

            else{
                hm.put(ch, 1);
            }
        }

        int form =0;
        int i=0;
        while(true){
            char ch= target.charAt(i);
            if(!hm.containsKey(ch) ||  hm.get(ch) ==0 ){
                break;
            }

            else if(i==m-1 && hm.containsKey(ch) && hm.get(ch)>=1 ){

                hm.put(ch, hm.get(ch)-1);
                i=0;
                form++;
                
            }

            else if( hm.containsKey(ch)  && hm.get(ch)>=1 ){
                 hm.put(ch, hm.get(ch)-1);

                i++;
            }



        }

        return form;
        
    }
}