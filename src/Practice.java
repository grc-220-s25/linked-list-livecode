public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(14);
        ListNode nextNumber = new ListNode(7);

        head.next = nextNumber;
        nextNumber.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        // System.out.println(head.data);
        // System.out.println(nextNumber.data); // or System.out.println(head.next.data);

        ListNode current = head;
        int total = 0;

        System.out.println("Looping:");
        while (current != null){
            //System.out.println(current.data);
            total += current.data;
            current = current.next;
        }
        System.out.println(total);

    }
}
