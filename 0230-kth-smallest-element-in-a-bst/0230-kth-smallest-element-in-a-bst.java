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
    private ArrayList<Integer>p;
    private void func(TreeNode root){
        if(root==null)return;
        func(root.left);
        p.add(root.val);
        func(root.right);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        p=new ArrayList<>();
        func(root);
        return p.get(k-1);
    }
}