# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        dummy = ListNode(0, head)
        prev = dummy
        curr = head
        while curr and curr.next :
            #save ptr vals
            nextNode = curr.next.next
            second = curr.next

            #update and swap pointers
            second.next = curr
            curr.next = nextNode
            prev.next = second

            #iterate
            prev = curr
            curr = nextNode
        return dummy.next
