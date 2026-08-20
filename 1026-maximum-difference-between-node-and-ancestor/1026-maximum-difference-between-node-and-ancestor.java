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
    int s;
    public void func(TreeNode root,int min,int max){
        if(root==null)return;

        s=Math.max(s,Math.max(Math.abs(root.val-min),Math.abs(root.val-max)));
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
       
        func(root.left,min,max);
        func(root.right,min,max);
    }
    public int maxAncestorDiff(TreeNode root) {
        
        if(root==null)return 0;
        s=Integer.MIN_VALUE;
        func(root,root.val,root.val);
        
        return s;
    }
}