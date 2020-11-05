public class checkBalanced extends BST
{
    public boolean isBalanced(BSTNode root)
    {
        /*
        a tree is balanced if the left and right subtee's height differ by at most 1

        */
        if (root == null) return true;

        int left_height = height(root.left);
        int right_height = height(root.right);

        if (Math.abs(left_height-right_height) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }
        return false;
    }

    private int height (BSTNode node)
    {
        if (node == null)
        {
            return 0;
        }
        int left_depth = height(node.left);
        int right_depth = height(node.right);
        return 1 + Math.max(left_depth, right_depth);
    }
}