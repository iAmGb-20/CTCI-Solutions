public class PartitionLists extends LinkedList {
    public Node partition(Node head, int x) {
        Node smallerHead = new Node(0);
        Node biggerHead = new Node(0);
        Node smaller = smallerHead, bigger = biggerHead;
        
        while (head != null)
        {
            if (head.data < x)
            {
                smaller.next = head;
                smaller = smaller.next;
            }
            else
            {
                bigger.next = head;
                bigger = bigger.next;
            }
            head = head.next;
        }
        //connect the two partitions
        smaller.next = biggerHead.next;
        bigger.next = null;
        return smallerHead.next;
    }
}
