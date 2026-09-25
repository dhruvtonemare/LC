# 500. Keyboard Row
# https://leetcode.com/problems/keyboard-row/

class Solution {
    public String[] findWords(String[] words) {



        HashMap<Character,Integer>hm = new HashMap<>();

                    hm.put('Q',1);
                    hm.put('W',1);
                    hm.put('E',1);
                    hm.put('R',1);
                    hm.put('T',1);
                    hm.put('Y',1);
                    hm.put('U',1);
                    hm.put('I',1);
                    hm.put('O',1);
                    hm.put('P',1);
                    hm.put('q',1);
                    hm.put('w',1);
                    hm.put('e',1);
                    hm.put('r',1);
                    hm.put('t',1);
                    hm.put('y',1);
                    hm.put('u',1);
                    hm.put('i',1);
                    hm.put('o',1);
                    hm.put('p',1);

                    hm.put('A',2);
                    hm.put('S',2);
                    hm.put('D',2);
                    hm.put('F',2);
                    hm.put('G',2);
                    hm.put('H',2);
                    hm.put('J',2);
                    hm.put('K',2);
                    hm.put('L',2);
                    hm.put('a',2);
                    hm.put('s',2);
                    hm.put('d',2);
                    hm.put('f',2);
                    hm.put('g',2);
                    hm.put('h',2);
                    hm.put('j',2);
                    hm.put('k',2);
                    hm.put('l',2);

                    hm.put('Z',3);
                    hm.put('X',3);
                    hm.put('C',3);
                    hm.put('V',3);
                    hm.put('B',3);
                    hm.put('N',3);
                    hm.put('M',3);
                    hm.put('z',3);
                    hm.put('x',3);
                    hm.put('c',3);
                    hm.put('v',3);
                    hm.put('b',3);
                    hm.put('n',3);
                    hm.put('m',3);


                List<String> resultList = new ArrayList<>();

                  




                    for(int i=0 ; i<words.length ; i++){

                        String x = words[i];


                        if(x.length()==1){

                            
                            
                          resultList.add(x);

                        }


                        

                        for(int j =1 ; j<  x.length() ; j++){

                           if(hm.get(x.charAt(j)) !=   hm.get(x.charAt(j-1))){

                            break;
                           }


                           else if(   j== x.length()-1  && hm.get(x.charAt(j)) ==   hm.get(x.charAt(j-1))){
                                     

                           resultList.add(x);


                           }







                        }
                    }

        
              return resultList.toArray(new String[0]);
        
        
    }
}