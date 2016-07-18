/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        if(root == null) return returnList;
        LinkedList<TreeNode> treeNode = new LinkedList<TreeNode>();
        treeNode.add(root);
        while(!treeNode.isEmpty())
        {
            List<Integer> temp = new ArrayList<Integer>();
            LinkedList<TreeNode> tempTreeNodeList = new LinkedList<TreeNode>();
            for(TreeNode tempTreeNode: treeNode)
            {
                temp.add(tempTreeNode.val);
                if(tempTreeNode.left != null) tempTreeNodeList.add(tempTreeNode.left);
                if(tempTreeNode.right != null) tempTreeNodeList.add(tempTreeNode.right);
            }
            treeNode = new LinkedList<TreeNode>(tempTreeNodeList);
            returnList.add(0,temp);
        }
        return returnList;
    }
}