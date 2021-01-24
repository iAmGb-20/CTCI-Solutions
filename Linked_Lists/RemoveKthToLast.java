public class RemoveKthToLast extends LinkedList {
    
    public Node RemoveNthFromEnd (Node head, int n)
    {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node fast = dummy.next;
        while (n > 0)
        {
            fast = fast.next;
            n--;
        }
        Node slow = dummy;
        
        while (fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = fast.next.next;

        return dummy.next;
    }
}
