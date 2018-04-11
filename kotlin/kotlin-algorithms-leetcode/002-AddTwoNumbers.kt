/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var total: Int = 0
        var order: Int = 1
        var l1copy = l1
        var l2copy = l2        
        val rootNode = ListNode(0)
        var result = rootNode
        var prevNode = result

        while(l1copy != null) {
            var oneNum: Int = l1copy?.`val`
            if(l2copy != null) {
                oneNum += l2copy?.`val`
            }
            oneNum += result.`val`

            result.`val` = (oneNum%10)            
            result.next = ListNode(0)
            prevNode = result
            result = result.next            

            if(oneNum >= 10) {                
                result.`val` += (oneNum/10)
            }

            l1copy = l1copy?.next
            l2copy = l2copy?.next            
        }

        while(l2copy != null) {
            var oneNum: Int = l2copy?.`val`            
            oneNum += result.`val`

            result.`val` = (oneNum%10)            
            result.next = ListNode(0)
            prevNode = result            
            result = result.next

            if(oneNum >= 10) {                
                result.`val` += (oneNum/10)
            }

            l2copy = l2copy?.next            
        }

        if(result.`val` == 0) {
            result = prevNode
            result.next = null
        }

        return rootNode
    }
}
