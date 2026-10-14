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
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode node, List<Integer> result, int currDepth){
        if(node == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(node.val);
        }
        
        rightView(node.right, result, currDepth + 1);
        rightView(node.left, result, currDepth + 1);
        
    }
}