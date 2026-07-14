// Last updated: 7/14/2026, 2:22:17 PM
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
    public String tree2str(TreeNode root) {
        if(root==null)return "";
        String result=root.val + "";
        String lefttree=tree2str(root.left);
        String righttree=tree2str(root.right);
        if(lefttree.equals("")&&righttree.equals("")){
            return result;
        }if(lefttree.equals("")){
            return result + "()" + "(" + righttree + ")";
        }if(righttree.equals("")){
            return result + "(" + lefttree + ")";
        }
        return result + "(" + lefttree + ")" + "(" + righttree + ")";
    }
}