Palindrome Linked List
**********************
Given the head of a singly linked list, return true if it is a  palindrome or false otherwise.

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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode ptr1 = head;
        while(ptr1 != null){
            st.push(ptr1.val);
            ptr1 = ptr1.next;
        }
        ListNode ptr2 = head;
        while(ptr2 != null){
            int value1 = ptr2.val;
            int value2 = st.pop();

            if(value1 != value2){
                return false;
            }
            ptr2 = ptr2.next;
        }
        return true;
    }
}

Example 1:

Input: head = [1,2,2,1]
Output: true
  
Example 2:

Input: head = [1,2]
Output: false

 
