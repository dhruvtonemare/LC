# 3945. Digit Frequency Score
# https://leetcode.com/problems/digit-frequency-score/

class Solution {
    public int digitFrequencyScore(int n) {


        if(n<=9){
            return n;
        }

        HashMap<Integer,Integer>hm = new HashMap<>();

        while(n>0){
            int d = n%10;

            

            if(hm.containsKey(d)){

                hm.put(d,hm.get(d)+1);
            }

            else{

                 hm.put(d,1);

            }

            n/=10;
        }

        int sum =0;

        for(int x : hm.keySet()){

            System.out.println(x+" "+hm.get(x));

            sum+=(x*hm.get(x));
        }


        return sum;
        
    }
}