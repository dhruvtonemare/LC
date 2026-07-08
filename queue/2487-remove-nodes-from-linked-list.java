# 2487. Remove Nodes From Linked List
# https://leetcode.com/problems/remove-nodes-from-linked-list/

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
    public ListNode removeNodes(ListNode head) {
        

        if(head == null ||  head.next == null){
            return head;
        }

        Stack<Integer>s = new Stack<>();

        ListNode temp = head;


        while(temp!=null){

            int curr = temp.val;
            if(s.isEmpty()){

                s.push(curr);

            }

            else if(s.peek()>=curr){
                s.push(curr);
            }

             else if(s.peek()<curr){
                while(!s.isEmpty() && s.peek()<curr){
                        s.pop();
                }

                s.push(curr);
            }

               



            temp=temp.next;
        }

          

          ListNode d= null;
               

            while(!s.isEmpty()){
                int a = s.pop();

                ListNode d_1= new ListNode(a);
                d_1.next=d;
                d=d_1;


            
                
            }

        
        return d;
    }
}