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
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer>temp=new ArrayList<>();
    if(root==null)return temp;
    Queue<TreeNode>q=new LinkedList<>();
    int c;
    q.offer(root);
    while(!q.isEmpty()){
        int s=q.size();
        c=0;
        while(s-- >0){
            TreeNode t=q.poll();
            if(c==0){
                temp.add(t.val);
            }
             if(t.right!=null)q.offer(t.right);
            if(t.left!=null)q.offer(t.left);
             c++;
        }
       
    }
     return temp;   
    }
}