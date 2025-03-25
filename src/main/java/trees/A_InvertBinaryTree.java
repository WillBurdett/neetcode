package trees;

public class A_InvertBinaryTree {

    // DFS (depth-first-search) allows us to solve this recursively
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return new TreeNode();
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
