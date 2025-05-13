public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(14);
        ListNode mySeven = new ListNode(7);
        
        head.next = mySeven;

        mySeven.next = new ListNode(28);
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);
        System.out.println();
        //System.out.println(head.data);

        ListNode current = head;
        head = new ListNode(888);
        System.out.println(head.data);
        
        int total = 0;
        while(current != null) {
         total += current.data;
         current = current.next;
      }
      System.out.println(total);
   }
}