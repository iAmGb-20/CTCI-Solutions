public class ReverseLinkedList extends LinkedList {
    public Node reverseList(Node head) {
        
        Node prevNode = null;
    
        while (head != null)
        {
            Node nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
           
        }
        return prevNode;
    }
}
