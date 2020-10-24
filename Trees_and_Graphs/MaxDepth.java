public class MaxDepth extends BST
{
    /* Height of a tree is defined as the number of edges 
    in the longest path from the root to the leaf node
    Depth of a tree is defined as the number of edges in the path 
    from the root to that specific node

    Therefore, height of a tree is equal to the maximum depth.
    These two terms "height" and "max depth" can be used interchangebly
    */

    public int getMaxDepth(BSTNode root)
    {
        if (root == null)
        {
            return 0;
        }
        int right_depth = getMaxDepth(root.right);
        int left_depth = getMaxDepth(root.left);
        return Math.max(right_depth, left_depth)+1;
    }

    
}
