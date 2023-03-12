// Problem : 104

// Input: root = [3,9,20,null,null,15,7]
// Output: 3

//       3                         3
//     /   \                      /  \
//    9    20   =>    left =1   9    20    right = 2
//        /  \                      /  \
//       15   7                    15   7

//  maximum = max(left,right) = 2 ; add with 1 for root height = 3 <= maximum depth of binary tree.


// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
}


class Solution {
    public int maxDepth(TreeNode root) {
        // Base Condition
        if(root == null) return 0;
        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // Induction
        return Math.max(left, right) + 1;
    }
}
