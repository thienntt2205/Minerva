package good_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodPairs {
    // Time: O(n^2)
    // Space: O(n^2)
    public int[][] GoodPairCount(int[] nums) {
        // Max length of result is Combination 2 of n. If the final result is
        // less than that, we will truncate the array later.
//        int maxResult = (nums.length * (nums.length - 1)) / 2;
//        int[][] temp = new int[maxResult][2];
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    res.add(new int[]{i, j});
                }
            }
        }

        return res.toArray(new int[][]{});
    }

    public static void main(String[] args) {
        GoodPairs Goodpair = new GoodPairs();
        int[] inputArray = {1, 1, 1, 1};
        System.out.println(Arrays.deepToString(Goodpair.GoodPairCount(inputArray)));
    }
}