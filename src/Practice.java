public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode (14);
ListNode MySeven = new ListNode(7);


// this sets head.next to MySeven value.
head.next = MySeven;
// this creates a new Node with a value
MySeven. next = new ListNode (28);
head.next.next = new ListNode (32);
head.next.next.next = new ListNode (23);
// System.out.println(head);
ListNode current = head;
int total = 0;
while (current != null) {
total += current.data;
current = current. next;
｝
System.out.println(total);
    }
}
