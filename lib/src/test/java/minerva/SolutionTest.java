package minerva;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    static class GoodPairTestCase {
        int[] input;
        int[][] expect;

        // factory method
        static GoodPairTestCase of(int[] input, int[][] expect) {
            GoodPairTestCase tc = new GoodPairTestCase();
            tc.input = input;
            tc.expect = expect;
            return tc;
        }
    }

    @Test
    void goodPairCount() {
        List<GoodPairTestCase> testCases = new ArrayList<>();
        testCases.add(GoodPairTestCase.of(
                new int[]{1, 1, 1},
                new int[][]{{0, 1}, {0, 2}, {1, 2}}
        ));

        testCases.add(GoodPairTestCase.of(
                new int[]{1, 0, 1},
                new int[][]{{0, 2}}
        ));
        testCases.add(GoodPairTestCase.of(
                new int[]{1, 2, 3, 1, 1, 3},
                new int[][]{{0, 3}, {0, 4}, {3, 4}, {2, 5}}
        ));
        testCases.add(GoodPairTestCase.of(
                new int[]{1, 2, 3},
                new int[][]{}
        ));

        Solution solution = new Solution();
        for (GoodPairTestCase tc : testCases) {
            int[][] actual = solution.GoodPairCount(tc.input);
            Arrays.sort(actual, Arrays::compare);
            Arrays.sort(tc.expect, Arrays::compare);

            assertArrayEquals(
                    actual, tc.expect,
                    String.format("input=%s, expect=%s, actual=%s",
                            Arrays.toString(tc.input),
                            Arrays.deepToString(tc.expect),
                            Arrays.deepToString(actual)
                    )
            );
        }
    }
}