# 1545. Find Kth Bit in Nth Binary String
# https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

class Solution {
    public char findKthBit(int n, int k) {

        if(k==0){
            return 0;
        }

        StringBuilder sb = new StringBuilder("0");

        for(int i =2 ; i<=n ; i++){
            
            
                
                StringBuilder m = new StringBuilder(sb).reverse(); 
                // then for invert 

                for(int j =0 ; j<m.length();j++){

                    if(m.charAt(j)=='0'){
                        m.setCharAt(j, '1');

                    }
                    else{
                        m.setCharAt(j, '0');
                    }

                }

                sb.append('1');

                sb.append(m);

                






            
        }

        return sb.charAt(k-1);
        
    }

    
}