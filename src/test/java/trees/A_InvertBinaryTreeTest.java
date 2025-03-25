package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_InvertBinaryTreeTest {

   private final A_InvertBinaryTree undertest = new A_InvertBinaryTree();

   @Test
    public void invertTree_happyPath() {
       // given
       TreeNode root = createTreeNodeRoot(new int[]{1,2,3,4,5,6,7});

       // when
       TreeNode actual = undertest.invertTree(root);
       printTree(actual, 0);

       // then
       TreeNode expected =  createTreeNodeRoot(new int[]{1,3,2,7,6,5,4});

       assertTrue(expected.equals(actual));
    }

    public static TreeNode createTreeNodeRoot(int[] values) {
        return buildTree(values, 0);
    }

    private static TreeNode buildTree(int[] values, int index) {
        if (index >= values.length) {
            return null;
        }

        TreeNode node = new TreeNode(values[index]);
        node.left = buildTree(values, 2 * index + 1);
        node.right = buildTree(values, 2 * index + 2);

        return node;
    }

    private static void printTree(TreeNode node, int level) {
        if (node == null) return;
        printTree(node.right, level + 1);
        System.out.println("  ".repeat(level) + node.val);
        printTree(node.left, level + 1);
    }
}