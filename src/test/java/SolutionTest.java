import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void kSmallestPairsTest1() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1, 2)));
        expected.add(new ArrayList<>(List.of(1, 4)));
        expected.add(new ArrayList<>(List.of(1, 6)));
        List<List<Integer>> actual = new Solution().kSmallestPairs(nums1, nums2, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kSmallestPairsTest2() {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1, 1)));
        expected.add(new ArrayList<>(List.of(1, 1)));
        List<List<Integer>> actual = new Solution().kSmallestPairs(nums1, nums2, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kSmallestPairsTest3() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3};
        int k = 3;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(List.of(1, 3)));
        expected.add(new ArrayList<>(List.of(2, 3)));
        List<List<Integer>> actual = new Solution().kSmallestPairs(nums1, nums2, k);

        Assert.assertEquals(expected, actual);
    }
}
