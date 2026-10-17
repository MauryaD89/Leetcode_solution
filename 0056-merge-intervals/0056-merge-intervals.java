
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort by starting value
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        // Step 2: Store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Process each interval
        for (int[] interval : intervals) {

            // Step 4: Check whether to add a new interval
            if (merged.isEmpty() ||
                merged.get(merged.size() - 1)[1] < interval[0]) {

                merged.add(interval);

            } else {
                // Step 5: Overlapping intervals
                int[] last = merged.get(merged.size() - 1);

                // Update the ending value
                last[1] = Math.max(last[1], interval[1]);
            }
        }

        // Step 6: Convert List into a 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
