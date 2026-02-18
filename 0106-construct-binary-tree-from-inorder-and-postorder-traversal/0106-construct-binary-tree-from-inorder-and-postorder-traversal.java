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
    public TreeNode func(int[] in,int[] post,int l,int r){
        if(l>r)return null;
        int val=post[index--];
        int part=-1;
        TreeNode root=new TreeNode(val);
        for(int i=0;i<in.length;i++){
            if(val==in[i])part=i;
        }
        root.right=func(in,post,part+1,r);
        root.left=func(in,post,l,part-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         index=postorder.length-1;
         return func(inorder,postorder,0,inorder.length-1);

    }
}