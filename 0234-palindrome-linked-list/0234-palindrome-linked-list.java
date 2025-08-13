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
        if(head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // find the middle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        ListNode secondHalfHead = reverseList(slow);

        // compare the first half with the reversed second half
        ListNode firstHalfPtr = head;
        ListNode secondHalfPtr = secondHalfHead;
        boolean isPalindrome = true;

        while(secondHalfPtr != null) {
            if(firstHalfPtr.val != secondHalfPtr.val) {
                isPalindrome = false;
                break;
            }
            firstHalfPtr = firstHalfPtr.next;
            secondHalfPtr = secondHalfPtr.next;
        }

        return isPalindrome;

    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
    while(current != null) {
          next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
      return prev;
    }
}