# 1669. Merge In Between Linked Lists
# https://leetcode.com/problems/merge-in-between-linked-lists/

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {


        // first append list 1 a-1 to the list 2 begining 

        int i=0 ;

        ListNode temp = list1;
        ListNode temp1 = list1;

        int j=0;

        while(i<a-1 || j<b+1){
           
           if(i<a-1  && j< b+1){

            i++;
            j++;
            temp=temp.next;
            temp1=temp1.next;

           }

           else if(i<a-1){
            i++;
              temp=temp.next;

           }

            else if(j<b+1){
            j++;
              temp1=temp1.next;

           }


        }

        System.out.println(temp.val);
        System.out.println(temp.next.val);


        temp.next = list2;

        //move forward to next list2 end
        while(temp.next!=null){
            temp=temp.next;
        }


       // attach list2  end with list 1
       temp.next=temp1;


       return list1;





        
    }
}