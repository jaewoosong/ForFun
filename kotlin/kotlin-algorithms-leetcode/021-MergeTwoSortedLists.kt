/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var result = ListNode(0) // dummy node
        var resultHead = result
        var l1curr = l1
        var l2curr = l2

        while((l1curr != null) && (l2curr != null)) {
            if(l1curr.`val` <= l2curr.`val`) {
                result.next = l1curr
                result = result.next
                l1curr = l1curr.next
            } else {
                result.next = l2curr
                result = result.next
                l2curr = l2curr.next
            }
        }

        if(l1curr == null) {
            result.next = l2curr
        } else {
            result.next = l1curr
        }

        return resultHead.next
    }
}
