public class Min_and_Max extends BST
{
    /* we will solve this problem both recursively and iteratively*/
    public int FindMin(BSTNode root)
    {
        if (root == null)
        {
            System.out.println("Error: Tree is empty");
            return -1;
        }
        BSTNode current = root;
        while (current.left != null)
        {
            current = current.left;
        }
        return current.data;
    }

    public int FindMinRec (BSTNode root)
    {
        if (root == null)
        {
            System.out.println("Error; Tree is empty");
            return -1;
        }
        if (root.left != null)
        {
            return FindMinRec(root.left);
        }
        else
        {
            return root.data;
        }
        
    }
    public int FindMax (BSTNode root)
    {
        if (root == null)
        {
            return -1;
        }
        while (root.right != null)
        {
            root = root.right;
        }
        return root.data;
    }

    public int FindMaxRec(BSTNode root)
    {
        if (root == null)
        {
            return -1;
        }
        if (root.right == null)
        {
            return root.data;
        }
        else
        {
            return FindMaxRec(root.right);
        }
    }
}
