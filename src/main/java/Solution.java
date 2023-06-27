import java.util.*;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(
                (a, b) -> (b.get(0) + b.get(1)) - (a.get(0) + a.get(1)));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pq.size() < k) {
                    pq.add(new ArrayList<>(List.of(nums1[i], nums2[j])));
                } else {
                    int lastPairSum = pq.peek().get(0) + pq.peek().get(1);

                    if (nums1[i] + nums2[j] > lastPairSum) {
                        break;
                    } else {
                        pq.poll();
                        pq.add(new ArrayList<>(List.of(nums1[i], nums2[j])));
                    }
                }

            }
        }
        List<List<Integer>> result = new ArrayList<>(pq);

        return result;
    }
}
