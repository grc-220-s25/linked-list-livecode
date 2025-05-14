public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode(14);
        ListNode MySeven = new ListNode(7);
        
        // this sets head.next to MySeven value.
        head.next = MySeven;

        // this creates a new Node with a value of 28 which is stored in MySeven.next etc...
        MySeven.next = new ListNode(28);
        head.next.next = new ListNode(32);
        head.next.next.next = new ListNode(23);

        

        // int result = tailData(head);
        // System.out.println(result);

        head = removeSecondNode(head);

        ListNode current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        // System.out.println(head);

    //     ListNode current = head;
    //     int total = 0;
    //     while(current != null) {
    //         total += current.data;
    //         current = current.next;
    //     }
    //     System.out.println(total);
    // }
    }

    public static int tailData(ListNode head) {
        if(head == null) return -1;

        ListNode current = head;

        while(current.next != null) {
            current = current.next;
        }
        return current.data;
    }
    public static ListNode removeSecondNode(ListNode head) {

        head.next = head.next.next;

        return head;

    }
}
