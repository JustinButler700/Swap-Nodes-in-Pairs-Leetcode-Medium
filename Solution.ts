/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function swapPairs(head: ListNode | null): ListNode | null {
    let dummy : ListNode = new ListNode(0, head);
    let prev : ListNode = dummy;
    let curr : ListNode = head;
    while(curr != null && curr.next != null){
        //First we save pointer values.
        let nextNode = curr.next.next;
        let second = curr.next;
        //Next, we swap pointers
        second.next = curr;
        curr.next = nextNode;
        prev.next = second;
        //Finally, we iterate 
        prev = curr;
        curr = nextNode;
    }
    return dummy.next;
};
