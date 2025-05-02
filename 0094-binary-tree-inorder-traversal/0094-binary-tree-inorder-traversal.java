/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l1 = new ArrayList<>(); 
        Inorder(root,l1);
        return l1;
    }
    public void Inorder(TreeNode root,List<Integer> l1)
    {
        if(root  == null)
        {
            return;
        }
        Inorder(root.left,l1);
        l1.add(root.val);
        Inorder(root.right,l1);
    }
}