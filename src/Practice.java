public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode mySeven = new ListNode(7);

        head.next = mySeven;

        mySeven.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        System.out.println();
        System.out.println();

        ListNode current = head;

        head = removeSecondNode(head);


        while (current != null){
            System.out.println(current.data);

            current = current.next;
        }

        // System.out.println(total);

    }

    public static int mystery(ListNode head){
        if (head == null) return -1;

        ListNode current = head;

        while (current.next != null){
            current = current.next;
        }

        return current.data;
    }

    public static ListNode removeSecondNode(ListNode head){
        //head.next = head.next.next;

        ListNode current = head.next;
        head.next = current.next;
        return head;
    }
}
