class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char pointer = 'a';

        for(char c : word.toCharArray()) {

            int distance =  Math.abs(c - pointer);
            int antiClock = 26 - distance;

            ans += (Math.min(distance , antiClock)) + 1;
            pointer = c;
        }
        return ans;
    }
}