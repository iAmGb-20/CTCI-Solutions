public class Cycle extends LinkedList {
    
    public boolean hasCycle(Node head)
    {
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;

        while (fast != null && slow != null && fast.next != null)
        {
            if (fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
