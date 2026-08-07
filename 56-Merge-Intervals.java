class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals ==  null || intervals.length < 2) return intervals;

        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0] , b[0]));

        List<int[]> ans = new ArrayList<>();

        int[] currentInterval = intervals[0];
        ans.add(currentInterval);

        for(int[] i : intervals) {
            int currEnd = currentInterval[1];
            int nextStart = i[0];
            int nextEnd = i[1];

            if(currEnd >= nextStart) {
                currentInterval[1] = Math.max(currEnd , nextEnd);
            }
            else{
                currentInterval = i;
                ans.add(currentInterval);
            }
        }
        return ans.toArray(new int[ans.size()] []);
    }
}