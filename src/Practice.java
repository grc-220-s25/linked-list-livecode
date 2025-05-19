public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(14);
        ListNode mySeven = new ListNode(7);

        head.next = mySeven;
        mySeven.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        // System.out.println(head.data);
        // System.out.println(nextNumber.data); // or System.out.println(head.next.data);

        // int result = tailData(head);
        // System.out.println(result);

        head = removeSecondNode(head);
        ListNode current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }

        // System.out.println("Looping:");
        // while (current != null){
        //     //System.out.println(current.data);
        //     total += current.data;
        //     current = current.next;
        // }
        // System.out.println(total);

    }

    public static int tailData(ListNode head){
        if (head == null){
            return -1;
        }
        // Current will point to what head is pointing
        ListNode current = head;

        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }

    public static ListNode removeSecondNode(ListNode head){
        head.next = head.next.next;
        return head;
    }


}
