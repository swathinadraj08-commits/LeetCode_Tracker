// Last updated: 7/14/2026, 2:34:03 PM
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
      List<Integer> list=new ArrayList<>();
      preorder(root,list);
      return list; }
      void preorder(TreeNode root,List<Integer> list) {
        if(root!=null) {
           
            preorder(root.left,list);
             list.add(root.val);
            preorder(root.right,list);
        } 
        
    }
}