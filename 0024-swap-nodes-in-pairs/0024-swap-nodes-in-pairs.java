class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to act as the predecessor of the first node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            // Identify the nodes to swap
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Swap the nodes
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // Move prev pointer two nodes forward
            prev = first;
        }
        
        return dummy.next;
    }
}