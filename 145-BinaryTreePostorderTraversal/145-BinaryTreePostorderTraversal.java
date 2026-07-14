// Last updated: 7/14/2026, 2:33:49 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> list=new ArrayList<>();
      postorder(root,list);
      return list; }
      void postorder(TreeNode root,List<Integer> list) {
        if(root!=null) { 
            postorder(root.left,list);
            postorder(root.right,list);
            list.add(root.val);
        } 
        
    }
}