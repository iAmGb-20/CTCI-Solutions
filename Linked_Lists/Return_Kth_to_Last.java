public class Return_Kth_to_Last extends LinkedList
{
    /*
    edge cases : if the linked list is empty, if there is one element
    a->b->c->d , (k=2) the element returned is b
    pseudocode:
        loop through the list and get the size of the list
        loop through the list (n-k) times
    */

    public int getKthToLast (Node head, int k)
    {
        int size = size(head);
        Node temp = head;
        
        for (int i = 0; i < (size-k); i++)
        {
            if (temp != null)
            {
                temp = temp.next;
            }
            else
            {
                break;
            }
        }


        return temp.data;
    }
    public int size (Node head)
    {
        Node curr = head;
        int count = 0;
        while (curr != null)
        {
            count++;
        }
        return count;
    }
    //this solution is too trivial..another attempt below
    public int kthToLast(Node head, int k)
    {
        Node temp = head;
        Node curr = head;
        int count = 0;
        while (count < k)
        {
            temp = temp.next;
        }
        while (temp != null)
        {
            curr = curr.next;
            temp = temp.next;
        }
        return curr.data;

    }


}