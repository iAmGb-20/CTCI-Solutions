public class Delete_a_Node extends BST 
{
    public BSTNode Delete (BSTNode root, int data)
    {
        if (root == null) return root;
        else if (data < root.data)
        {
            root.left = Delete(root.left, data);
        }
        else if (data > root.data)
        {
            root.right = Delete(root.right, data);
        }
        else
        {
            //Case 1: if we are deleting a leaf
            if (root.left == null && root.right == null)
            {
                root = null;
            }
            else if (root.left == null)
            {
                root = root.right;
            }
            else if (root.right == null)
            {
                root = root.left;
                
            }
            else
            {
                //case 3: if we are deleting a node with two children
                BSTNode temp = FindMin(root.right);
                root.data = temp.data;
                root.right = Delete(root.right, temp.data);
            }
        }
        return root;
    }
    public BSTNode FindMin (BSTNode root)
    {
        if (root == null)
        {
            return null;
        }
        if (root.left != null)
        {
            return FindMin(root.left);
        }
        else
        {
            return root;
        }
        
    }
    
}
    

