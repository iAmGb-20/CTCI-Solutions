public class PalindromeLinkedList extends LinkedList {
    public boolean isPalindrome(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        if (fastPtr != null)
        {
            slowPtr = slowPtr.next;
        }//this means we have an even length
        
        slowPtr = reverse(slowPtr);
        fastPtr = head;
        
        while (slowPtr != null)
        {
            if (slowPtr.data != fastPtr.data)
            {
                return false;
            }
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        return true;
        
    }
    private Node reverse(Node node)
    {
        Node prev = null;
        while (node != null)
        {
            Node nextNode = node.next;
            node.next = prev;
            prev = node;
            node = nextNode;
        }
        return prev;
    }
}
