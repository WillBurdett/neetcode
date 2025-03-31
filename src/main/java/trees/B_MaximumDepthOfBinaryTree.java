package trees;

import java.util.ArrayDeque;
import java.util.Stack;

public class B_MaximumDepthOfBinaryTree {

    // DFS recursively (in-order) (best)
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // BFS (breadth-first-search)
    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int level = 0;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode node = q.pollFirst();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            level+=1;
        }
        return level;
    }

    // Iterative DFS (pre-ordered)
    public int maxDepthIterativeDFS(TreeNode root) {
        Stack<IterativeNode> stack = new Stack<>();
        stack.add(new IterativeNode(root, 1));

        int res = 0;

        while(!stack.empty()) {
            IterativeNode n = stack.pop();

            if (n != null && n.node != null) {
                res = Math.max(res, n.depth);
                stack.push(new IterativeNode(n.node.left, n.depth + 1));
                stack.push(new IterativeNode(n.node.right, n.depth + 1));
            }
        }
        return res;
    }

    public class IterativeNode {
        private TreeNode node;
        private int depth;

        public IterativeNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

}
