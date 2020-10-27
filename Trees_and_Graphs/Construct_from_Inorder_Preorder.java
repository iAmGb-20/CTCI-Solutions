public class Construct_from_Inorder_Preorder {
    
  //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
 
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return constructFromInPre(preorder, inorder, 0, inorder.length-1, 0);
        }
        private TreeNode constructFromInPre (int[] preorder, int[] inorder, int start, int end, int index)
        {
            if (start > end)
            {
                return null;
            }
            TreeNode root = new TreeNode(preorder[index]);
            
            int inRootIndex = start;
            while (preorder[index] != inorder[inRootIndex])
            {
                inRootIndex++;
            }
            root.right = constructFromInPre(preorder, inorder, inRootIndex+1, end, index+inRootIndex-start+1);
            root.left = constructFromInPre(preorder, inorder, start, inRootIndex-1,index+1);
            return root;
        }
    }
}
