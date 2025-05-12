public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(14);
        ListNode mySeven = new ListNode(7);

        head.next = mySeven;

        mySeven.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        System.out.println();
        // System.out.println(head);

        ListNode current = head;
        int total = 0;
        while (current != null) {
            // System.out.println(current.data);
            total += current.data;
            current = current.next;
        }
        System.out.println(total);

    }
}
