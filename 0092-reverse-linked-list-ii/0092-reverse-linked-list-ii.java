class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // 1. Move prev to the node just before the 'left' position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // 2. Reverse the sublist from left to right
        ListNode curr = prev.next;
        ListNode nextNode = null;
        ListNode subListHead = curr;

        ListNode prevNode = null;
        for (int i = 0; i <= right - left; i++) {
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }

        // 3. Connect the reversed portion back to the main list
        prev.next = prevNode;
        subListHead.next = curr;

        return dummy.next;
    }
}