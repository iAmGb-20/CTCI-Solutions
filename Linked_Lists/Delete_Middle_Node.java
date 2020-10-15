public class Delete_Middle_Node extends LinkedList
{
    public void deleteNode(Node toDelete)
    {
        Node temp = toDelete.next;
        toDelete.data = temp.data;
        toDelete.next = temp.next;
    }
    
}
/*
pretty easy question
*/