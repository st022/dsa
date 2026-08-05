class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort intervals by ending time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlap
            if (intervals[i][0] < end) {
                count++;
            } 
            else {
                // No overlap, update end
                end = intervals[i][1];
            }
        }

        return count;
    }
}