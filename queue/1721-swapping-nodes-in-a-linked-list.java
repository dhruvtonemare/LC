# 1721. Swapping Nodes in a Linked List
# https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

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
    public ListNode swapNodes(ListNode head, int k) {

        if(head.next == null){

            return head;
        }

        ArrayList<Integer>a =new ArrayList<>();

        ListNode temp= head;

        while(temp!=null){

            a.add(temp.val);

            temp=temp.next;
        }


        int temmp=a.get(k-1);

        a.set(k-1,a.get(a.size()-k));
        a.set(a.size()-k,temmp);


        int i=0;

        temp=head;
        while(temp!=null){

            temp.val=a.get(i);
            i++;
            temp=temp.next;
        }

        return head;

        
    }
}