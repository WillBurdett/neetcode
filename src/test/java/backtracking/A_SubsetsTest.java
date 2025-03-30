package backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class A_SubsetsTest {

    private final A_Subsets undertest = new A_Subsets();

    @Test
    public void subsets_validWithThreeNumbers() {
        // given
        int[] nums = {1,2,3};

        // when
        List<List<Integer>> actual = undertest.subsets(nums);

        // then
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of());
        expected.add(List.of(1));
        expected.add(List.of(2));
        expected.add(List.of(1,2));
        expected.add(List.of(3));
        expected.add(List.of(1,3));
        expected.add(List.of(2,3));
        expected.add(List.of(1,2,3));

        listsEqual(expected, actual);
    }

    @Test
    public void subsets_validWithOneNumber() {
        // given
        int[] nums = {7};

        // when
        List<List<Integer>> actual = undertest.subsets(nums);

        // then
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of());
        expected.add(List.of(7));

       listsEqual(expected, actual);
    }

    private void listsEqual(List<List<Integer>> a, List<List<Integer>> b) {
        assertTrue(a.size() == b.size() && a.containsAll(b) && b.containsAll(a));
    }
}