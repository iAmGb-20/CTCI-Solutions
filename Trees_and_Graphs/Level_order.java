import java.util.*;
public class Level_order extends BST
{
    public void LevelOrder(BST root)
    {
        if (root == null) return;
        Queue<BSTNode> Q = new Queue<BSTNode>();
        Q.offer(root);
        while (!Q.isEmpty())
        {
            BSTNode current = Q.peek();
            System.out.println("Current data is: " + current.data);
            if (current.left != null) Q.offer(current.left);
            if (current.right != null) Q.offer(current.right);
            Q.pop();
        }
        
    }

    public List<<List<Integer>> levelorder (BSTNode root)
    {
        List<List<Integer>> lorder = new ArrayList<List<Integer>>();
        if (root == null) return lorder; //return an empty list in case the root is null
        Queue<BSTNode> toDiscover = new Queue<BSTNode>();
        toDiscover.offer(root);

        while(!toDiscover.isEmpty())
        {
            ArrayList<Integer>subList = new ArrayList<Integer>();
            int currsize = Q.size();
            for (int i = 0; i < currsize; i++)
            {
                if (Q.peek().left != null) Q.offer(Q.peek().left);
                if (Q.peek().right != null) Q.offer(Q.peek().right);
                subList.add(Q.poll().data);
            }
            lorder.add(subList);
        }
        return lorder;
    }
}
