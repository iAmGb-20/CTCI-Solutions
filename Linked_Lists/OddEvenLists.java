public class OddEvenLists extends LinkedList {
    public Node oddEvenList(Node head) {
        if (head == null) return head;
        Node even = head.next;
        Node odd = head;
        Node evenHead = even;
        
        while (even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        
        return head;
    }
}
