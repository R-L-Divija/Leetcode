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
    int index;
    public TreeNode func(int pre[],int in[],int l,int r){
        if(l>r)return null;
        int val=pre[index];
        index++;
        TreeNode root=new TreeNode(val);
        int part=-1;
        for(int i=0;i<pre.length;i++){
            if(val==in[i])part=i;
        }
        root.left=func(pre,in,l,part-1);
        root.right=func(pre,in,part+1,r);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        return func(preorder,inorder,0,inorder.length-1);
    }
}