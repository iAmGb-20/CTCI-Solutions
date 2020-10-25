public class BST
{
    class BSTNode
    {
        int data;
        BSTNode left;
        BSTNode right;
    }

    BSTNode root;

    //inserting to a BST
    public BSTNode insert(BSTNode root, int data)
    {
        //1st case: tree can be empty...
        if (root == null)
        {
            root = getNewNode(data);
        }
        //2nd case: tree is not empty
        //if data to be inserted then it could go to the left subtree, else do the opposite
        else if (data <= root.data)
        {
            root.left = insert(root.left, data);
        }
        else
        {
            root.right = insert(root.right, data);
        }
        return root;
    }

    //searching in a BST
    public boolean search (BSTNode root, int data)
    {
        if (root == null)
        {
            return false;
        }
        else if (root.data == data)
        {
            return true;
        }
        else if (data <= root.data)
        {
            return search(root.left, data);
        }
        else 
        {
            return search(root.right, data);
        }
    }



    //function to create a new BST node
    public BSTNode getNewNode (int data)
    {
        BSTNode newNode = new BSTNode();
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }
}
