package trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class B_MaximumDepthOfBinaryTreeTest {

    private final B_MaximumDepthOfBinaryTree undertest = new B_MaximumDepthOfBinaryTree();

    @Test
    public void maxDepth_4NodeHappyPath(){
        // given
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));

        // when
        int actual = undertest.maxDepth(root);

        // then
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxDepth_0NodeHappyPath(){
        // given
        TreeNode root = null;

        // when
        int actual = undertest.maxDepth(root);

        // then
        int expected = 0;
        assertEquals(expected, actual);
    }

}