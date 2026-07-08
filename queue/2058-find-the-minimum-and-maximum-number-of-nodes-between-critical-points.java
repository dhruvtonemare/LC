# 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
# https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if(head.next == null || head.next.next == null){

            int [] res = new int [2];

            res [0]=-1;
            res[1]=-1;

            return res;
        }


       ArrayList<Integer>a = new ArrayList<>();


        ListNode temp = head .next ;

        int prev = head.val;

        int pos=2;
        

        while(temp.next!=null){

            if(temp.val>prev && temp.val>temp.next.val){
                a.add(pos);
            }

            else if(temp.val<prev && temp.val<temp.next.val){
                a.add(pos);
            }

            prev=temp.val;
            pos++;
            temp=temp.next;
        }

        if(a.size()<=1){
         
          int [] res = new int [2];

            res [0]=-1;
            res[1]=-1;

            return res;
        
        }

       Collections.sort(a);
       
       int res[] = new int[2];

       res[1]=a.get(a.size()-1)-a.get(0);


       int min=Integer.MAX_VALUE;

       for(int i=0 ; i<a.size()-1 ; i++){

          int val = a.get(i+1)-a.get(i);

          min= Math.min(min,val);
       }


       res[0]=min;

       return res;


        
    }
}