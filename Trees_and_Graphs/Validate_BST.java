public class Validate_BST extends BST
{
    //using inorder traversal
    public boolean isValidBST(BSTNode root)
    {
        Integer last_curr = null;
        if (root == null)
        {
            return true;
        }

        if (!isValidBST(root.left)) return false;

        if (last_curr!= null && last_curr >= root.data)
        {
            return false;
        }
        last_curr = root.data;

        if (!isValidBST(root.right)) return false;

        return true;

    }
    //using an array
    static int N = 0;
    int index = 0;
    public void copyBST(BSTNode root, int[] arr)
    {
        if (root == null) return;
        copyBST(root.left, arr);
        arr[index] = root.data;
        index++;
        copyBST(root.right, arr);
    }
    private int size (BSTNode root)
    {
        if (root != null)
        {
            size(root.left);
            N++;
            size(root.right);
        }
        return N;
    }
    public boolean validBST(BSTNode root)
    {
        int [] arr = new int[size(root)];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] <= arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

}