public class Check_if_BST extends BST
{
    //1st approach
    public boolean isBinarySearchTree (BSTNode root)
    {
        if (root == null) return true;
        return (isSubTreeGreater(root.right, root.data) && isBinarySearchTree(root.right)
                && isSubTreeLesser(root.right, root.data) && isBinarySearchTree(root.right));
    }

    public boolean isSubTreeLesser(BSTNode root, int value)
    {
        if (root == null) return true;
            return (root.data <= value) 
            && isSubTreeLesser(root.left, value) 
            && (isSubTreeLesser(root.right, value));

            return false;
        
    }

    public boolean isSubTreeGreater(BSTNode root, int value)
    {
        if (root == null) return true;
            return (root.data >= value) 
            && isSubTreeGreater(root.left, value) 
            && (isSubTreeGreater(root.right, value));

            return false;
    }
}