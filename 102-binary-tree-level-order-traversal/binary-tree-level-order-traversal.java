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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
	if(root==null)  return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int ls=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=1;i<=ls;i++){
                TreeNode x=q.poll();
                level.add(x.val);
                if(x.left!=null)  q.offer(x.left);
                if(x.right!=null)  q.offer(x.right);
            }
            ans.add(level);
        }
        return ans;
    }
}