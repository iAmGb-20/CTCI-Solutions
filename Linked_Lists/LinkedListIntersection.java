public class LinkedListIntersection extends LinkedList {
    //my approach
    public Node findIntersection(Node headA, Node headB)
    {
        int lengthA = calcLength(headA);
        
        int lengthB = calcLength(headB);
        
        int difference = Math.abs(lengthA - lengthB);
        
        for (int i = 0; i < difference; i++)
        {
            if (lengthA > lengthB) 
            {
                headA = headA.next;
            }
            else {
                headB = headB.next;
            }
       
        }
        
        while (headA != null && headB != null)
        {
            if (headA == headB)
            {
               return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;

    }
    
    public int calcLength (Node head)
    {
        Node temp = head;
        
        int length = 0;
        while (temp != null)
        {
            length++;
            temp = temp.next;
        }

        return length;
    }




    //approach two (without calculating the length)
    public Node getIntersectionNode(Node headA, Node headB)
    {
        //boundary check
        if(headA == null || headB == null) return null;
        
        Node a = headA;
        Node b = headB;
        
        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }
        
        return a;
    }

    
}
