import java.util.*;
public class Level_order extends BST
{
    public void LevelOrder(BSTNode root)
    {
        if (root == null) return;
        Queue<BSTNode> Q = new LinkedList<BSTNode>();
        Q.offer(root);
        while (!Q.isEmpty())
        {
            BSTNode current = Q.peek();
            System.out.println("Current data is: " + current.data);
            if (current.left != null) Q.offer(current.left);
            if (current.right != null) Q.offer(current.right);
            Q.remove();
        }
        
    }

    public List<List<Integer>>levelorder (BSTNode root)
    {
        List<List<Integer>> lorder = new LinkedList<List<Integer>>();
        if (root == null) return lorder; //return an empty list in case the root is null
        Queue<BSTNode> toDiscover = new LinkedList<BSTNode>();
        toDiscover.offer(root);

        while(!toDiscover.isEmpty())
        {
            ArrayList<Integer>subList = new ArrayList<Integer>();
            int currsize = toDiscover.size();
            for (int i = 0; i < currsize; i++)
            {
                if (toDiscover.peek().left != null) toDiscover.offer(toDiscover.peek().left);
                if (toDiscover.peek().right != null) toDiscover.offer(toDiscover.peek().right);
                subList.add(toDiscover.poll().data);
            }
            lorder.add(subList);
        }
        return lorder;
    }
}
