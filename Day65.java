Double a Number Represented as a Linked List
*******************************************
You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.

Return the head of the linked list after doubling it.

Program
*******
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
    public ListNode ReverseLL(ListNode head){
        ListNode current = head;
        ListNode previous = null;

        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;

            previous = current;
            current = temp;
        }
        return previous;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode nhead = ReverseLL(head);

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        int carry = 0;

        while(nhead!=null){
            int sum = nhead.val+nhead.val+carry;
            int d=sum%10;
            carry=sum/10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;

            nhead=nhead.next;
        }
        if(carry>0){
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }
        ans = ReverseLL(ans.next);
        return ans;

    }
}

Example 1:

Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.

Example 2:

Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 
 
