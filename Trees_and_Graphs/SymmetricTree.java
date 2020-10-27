public class SymmetricTree extends BST {
    
    public boolean isSymmetric (BSTNode root)
    {
        return root == null || check(root.left, root.right);
    }

    private boolean check(BSTNode leftSub, BSTNode rightSub)
    {
        if (leftSub == null && rightSub == null)
        {
            return true;
        }
        else if (leftSub!=null && rightSub!=null)
        {
            return leftSub.data == rightSub.data && check(leftSub.left, rightSub.left) && check(leftSub.right, rightSub.left);
        }
        return false;
    }
}
