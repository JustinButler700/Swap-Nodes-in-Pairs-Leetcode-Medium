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
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(0, head); // dummy value to hold our new start pos.
        ListNode prev = root;
        ListNode curr = head;
        while(curr != null && curr.next != null)
        {
            //store pointer values
            ListNode nextNode = curr.next.next;
            ListNode second = curr.next;

            //Now we can swap our pointers.
            second.next =  curr;
            curr.next = nextNode;
            prev.next = second;
            
            // Now we can iterate.
            prev = curr;
            curr = nextNode;
        }
        return root.next;

        
    }
}
