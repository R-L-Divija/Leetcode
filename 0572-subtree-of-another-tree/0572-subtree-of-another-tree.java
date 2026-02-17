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
    public boolean check(TreeNode a,TreeNode b){
        if(a==null&&b==null)return true;
        if(a==null||b==null)return false;
        if(a.val!=b.val)return false;
        return check(a.left,b.left)&&check(a.right,b.right);
    }
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if(S==null)return true;
        if(T==null)return false;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(T);
        while(!q.isEmpty()){
          TreeNode t=q.poll();
          if(t.val==S.val){
            if(check(t,S))return true;
          }
          if(t.left!=null)q.offer(t.left);
           if(t.right!=null)q.offer(t.right);
        }
       return false; 
    }
}