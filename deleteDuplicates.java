class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode nodeA = head;

        while (nodeA != null) {
            ListNode nodeB = nodeA.next;

            // Skip all nodes with the same value
            while (nodeB != null && nodeB.val == nodeA.val) {
                nodeB = nodeB.next;
            }

            nodeA.next = nodeB;  
            nodeA = nodeA.next;  
        }

        return head;
    }
}
