public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode mySeven = new ListNode(7);

        head.next = mySeven;

        mySeven.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        System.out.println(head.data);
        System.out.println(head.next.data);

        ListNode current = head;

        while (current != null){
            System.out.println(current.data);

            current = current.next;
        }

    }
}
