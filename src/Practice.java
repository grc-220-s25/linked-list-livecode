public class Practice {
    public static void main(String[] args) {
        //this is a new variable listNode named head with the value 14
        ListNode head = new ListNode(14); //pass the value 14 to the constructor data
        
        //this is a new variable listNode named mySeven with the value 7
        ListNode mySeven = new ListNode(7);

        //this means i go to the next value of the next node after the head. here the head is 14, the begening. 
        head.next = mySeven;

        //This create a new ListNode after the node 7.
        mySeven.next = new ListNode(28);
        //This also create a new ListNode
        head.next.next.next = new ListNode(32);
        head.next.next.next.next = new ListNode(23);

        
        
                                    //Print output....
            //to print the head node
        // System.out.println(head.data);

            //to print the next node after the head. but you can also do printl(mySeven.data)
        // System.out.println(head.next.data); 

            //this print the Node with the value 28, we put 2 .next because it's the second Node after the head 14. and if we create more we can go so on with .next
        // System.out.println(head.next.next.data);

        // System.out.println(head);

        ListNode current = head; //this means current take the value of the head whatever what is the head.
        
        int total = 0;


        //this check that if there is nothing anymore stop. when we reach the last number.
        //as long as current is not equal to null, do the statement. 
        while(current != null){
            //print current, wich is the head 14.
            System.out.println(current.data);
            //take the value of the next node with current.next and store it inside current, then repeat the loop until we see a null then stop.
            
            total += current.data;
            
            //this is important and not forget it.
            current = current.next;

        }
        System.out.println("The total is: " + total);

        // System.out.println(current.data); //print out 14, which is the head now.

    }

}
