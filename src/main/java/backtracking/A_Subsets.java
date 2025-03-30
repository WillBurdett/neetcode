package backtracking;

import java.util.ArrayList;
import java.util.List;

public class A_Subsets {

    /**
                                 []
                            /          \
                       [1]             []
                     /     \         /     \
                 [1,2]    [1]     [2]      []
                /    \    /   \   /   \    /   \
            [1,2,3] [1,2] [1,3] [1] [2,3] [2] [3] []

       Each node represents a subset at a particular stage of recursion.
        - The left branch includes the current element.
        - The right branch excludes the current element.
        - When reaching the base case (i >= nums.length), the subset is added to 'res'.

    **/

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubsets(res, nums, subset, 0);

        return res;
    }

    private void createSubsets(List<List<Integer>> res,int[] nums, List<Integer> subset, int i) {

        // base case
        if (i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // decision to include nums[i]
        subset.add(nums[i]);
        createSubsets(res, nums, subset, i + 1);

        // decision NOT to include nums[i]
        subset.remove(subset.size() - 1);
        createSubsets(res, nums, subset, i + 1);

    }

}
