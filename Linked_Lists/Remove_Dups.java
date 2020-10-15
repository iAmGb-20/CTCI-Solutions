import java.util.HashSet;

public class Remove_Dups extends LinkedList
{
    /*
    Remove duplicates from an unsorted linked list
    --using a hashtable
    what type of linked list is this? Integer?
    Test case: a->b->c->a..Output: a->b->c
                a->b->b->c->d ..Output: a->b->c->d
    Procedure:
        Iterate the linked list
        If I see an element, I add it to the hashtable only if it is not there
        If it is there, I change the pointers to make sure the previous element points to the element next to the repeated one
        helper functions?? How will I move the pointers??r
    */
    
    public void remove_dups (Node head)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        Node prev = null;
        while (head != null)
        {
            if (!set.contains(head.data))
            {
                set.add(head.data);
                prev = head;
            }
            else
            {
                prev.next = head.next;
            }
            head = head.next;
        }
        /*
        This is my algorithm...
        Hashtable<Integer, Integer> checker = new Hashtable<Integer, Integer>();
        Node temp = head;
        Node prev = null;
        while (temp != null)
        {
            if (!checker.containsKey(temp.data))
            {
                checker.put(temp.data, i);
                prev = temp;
                temp = temp.next;
            }
            else
            {
                prev.next = temp.next;
                temp = temp.next;
            }
        }
        Code would take O(n) time whereby n is the number of elements in the list

        */


    }



}
