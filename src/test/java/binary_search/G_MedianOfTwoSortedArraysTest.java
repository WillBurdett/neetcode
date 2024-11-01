package binary_search;

import static org.junit.Assert.*;

import org.junit.Test;

public class G_MedianOfTwoSortedArraysTest {

  private final G_MedianOfTwoSortedArrays undertest = new G_MedianOfTwoSortedArrays();

  @Test
  public void findMedianSortedArrays_happyPath() {
    final int[] nums1 = new int[]{1,2};
    final int[] nums2 = new int[]{3};

    final double expected = 2.0;
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted array {1, 2, 3}", expected, actual, 0);
  }

  @Test
  public void findMedianSortedArrays_happyPath2() {
    final int[] nums1 = new int[]{1,3};
    final int[] nums2 = new int[]{2,4};

    final double expected = 2.5;
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted Array {1, 2, 3, 4}", expected, actual, 0);
  }

  @Test
  public void findMedianSortedArrays_oddLength() {
    final int[] nums1 = new int[]{1, 3, 8};
    final int[] nums2 = new int[]{7, 9, 10, 11};

    final double expected = 8.0; // The median of {1, 3, 7, 8, 9, 10, 11} is 8.0
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted array {1, 3, 7, 8, 9, 10, 11}", expected, actual, 0);
  }

  @Test
  public void findMedianSortedArrays_evenLength() {
    final int[] nums1 = new int[]{1, 2};
    final int[] nums2 = new int[]{3, 4, 5, 6};

    final double expected = 3.5; // The median of {1, 2, 3, 4, 5, 6} is (3 + 4) / 2 = 3.5
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted array {1, 2, 3, 4, 5, 6}", expected, actual, 0);
  }

  @Test
  public void findMedianSortedArrays_emptyArray() {
    final int[] nums1 = new int[]{};
    final int[] nums2 = new int[]{1, 2, 3, 4, 5};

    final double expected = 3.0; // The median of {1, 2, 3, 4, 5} is 3.0
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted array {1, 2, 3, 4, 5}", expected, actual, 0);
  }

  @Test
  public void findMedianSortedArrays_bothArraysAreLength1() {
    final int[] nums1 = new int[]{1};
    final int[] nums2 = new int[]{2};

    final double expected = 1.5; // The median of {1, 2} is 1.5
    final double actual = undertest.findMedianSortedArrays(nums1, nums2);

    assertEquals("Median was incorrect for sorted array {1, 2}", expected, actual, 0);
  }

}