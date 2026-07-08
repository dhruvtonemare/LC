# 234. Palindrome Linked List
# https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {


        StringBuilder sb = new StringBuilder("");

        ListNode temp =head;

        while(temp!=null){

           sb.append(String.valueOf(temp.val));

           temp= temp.next;
        }

        for(int i=0 ; i<sb.length()/2 ; i++){

            if(sb.charAt(i)!=sb.charAt(sb.length()-i-1)){
                return false;
            }
        }


        return true;
        
    }
}