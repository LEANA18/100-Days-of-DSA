Next Greater Node In Linked List
********************************
You are given the head of a linked list with n nodes.

For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.

Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.

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
    public int sizeLL(ListNode head){
        int count=0;
        ListNode ptr=head;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;

    }
    public ListNode reverseLL(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;

        }
        return previous;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode nhead= reverseLL(head);

        Stack<Integer> st = new Stack<>();
        st.push(nhead.val);
        ListNode current = nhead.next;
        int ptr = size-2;

        while(ptr>=0){
            int element = current.val;
            current = current.next;
            while(st.size()>0 && st.peek()<=element){
                st.pop();
            }
            if(st.size()==0){
                arr[ptr]=0;
            }
            else{
                arr[ptr]=st.peek();
            }
            st.push(element);
            ptr--;
        }

        return arr;

    }
}

Example 1:

Input: head = [2,1,5]
Output: [5,5,0]
  
Example 2:

Input: head = [2,7,4,3,5]
Output: [7,0,5,5,0]
 
